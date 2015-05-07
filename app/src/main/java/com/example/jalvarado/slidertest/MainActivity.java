package com.example.jalvarado.slidertest;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jalvarado.slidertest.utils.HttpUtil;
import com.example.jalvarado.slidertest.utils.NetworkUtil;
import com.squareup.okhttp.Response;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private NetworkUtil mNetworkUtil;
    private HttpUtil mHttpUtil;
    private ListingViewPresenter mListingViewPresenter;
    private DetailedListing mDetailedListing;

    private GridView mGridView;
    private int mImageWidth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGridView = (GridView) findViewById(R.id.grid_view);

        mImageWidth = getWindowManager().getDefaultDisplay().getWidth()/3;
        mGridView.setColumnWidth(mImageWidth);

        mListingViewPresenter = new ListingViewPresenter();
        mNetworkUtil = new NetworkUtil(this);
        mHttpUtil = new HttpUtil();

        int mlsPropertyId = 409478;

        getSingleDetailedListing(mlsPropertyId);
    }


    private void getSingleDetailedListing(int listing_id) {
        String searchUrl = "http://android.goidx.com/search/?id="+listing_id;

        Log.v(TAG, searchUrl);
        if(mNetworkUtil.isNetworkAvailable()) {
            mHttpUtil.get(searchUrl, new HttpUtil.HttpCallback() {
                @Override
                public void onFailure(Response response, IOException e) {

                }

                @Override
                public void onSuccess(Response response) {
                    try {
                        String jsonData = response.body().string();
                        mDetailedListing = mListingViewPresenter.getDetailedListing(jsonData);
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                doUIStuff();
                            }
                        });
                        Log.v(TAG, jsonData);
                    } catch (IOException | JSONException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void doUIStuff() {
        final List<DetailedListing.ListingImage> images = mDetailedListing.getListingImages();
        mGridView.setAdapter(new GridViewAdapter(images, mImageWidth));
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, FullScreenViewActivity.class);
                intent.putExtra("position", i);
                intent.putExtra("detailedListing", mDetailedListing);
                startActivity(intent);
            }
        });

    }

    public static class GridViewAdapter extends BaseAdapter {

        private List<DetailedListing.ListingImage> mImagesList;
        private int imageWidth;

        public GridViewAdapter(List<DetailedListing.ListingImage> imagesList, int imageWidth) {
            mImagesList = imagesList;
            imageWidth = imageWidth;
        }

        @Override
        public int getCount() {
            return mImagesList.size();
        }

        @Override
        public Object getItem(int i) {
            return "Item " + String.valueOf(i + 1);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext())
                        .inflate(R.layout.grid_item, viewGroup, false);
            }

            String imageUrl = mImagesList.get(i).getFileName();
            view.setTag(imageUrl);

            ImageView image = (ImageView) view.findViewById(R.id.image);


            Picasso.with(view.getContext())
                    .load(imageUrl)
                    .into(image);


            return view;

        }
    }

}
