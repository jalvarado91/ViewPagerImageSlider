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
import android.widget.Toast;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;
import com.example.jalvarado.slidertest.utils.HttpUtil;
import com.example.jalvarado.slidertest.utils.NetworkUtil;
import com.squareup.okhttp.Response;
import com.squareup.picasso.Picasso;

import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity implements BaseSliderView.OnSliderClickListener {

    public static final String TAG = MainActivity.class.getSimpleName();

    private NetworkUtil mNetworkUtil;
    private HttpUtil mHttpUtil;
    private ListingViewPresenter mListingViewPresenter;
    private DetailedListing mDetailedListing;

    private GridView mGridView;
    private int mImageWidth;


    private SliderLayout mViewSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mViewSlider = (SliderLayout) findViewById(R.id.slider);

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

        for (DetailedListing.ListingImage listingImage : images){
            DefaultSliderView sliderView = new DefaultSliderView(this);
            sliderView.image(listingImage.getFileName())
                    .setScaleType(BaseSliderView.ScaleType.FitCenterCrop)
                    .setOnSliderClickListener(this);

            mViewSlider.addSlider(sliderView);
        }
        mViewSlider.setPresetTransformer(SliderLayout.Transformer.Default);
        mViewSlider.setIndicatorVisibility(PagerIndicator.IndicatorVisibility.Invisible);
        mViewSlider.stopAutoCycle();
    }

    @Override
    public void onSliderClick(BaseSliderView baseSliderView) {
        baseSliderView.getBundle();
        Log.v("YO", baseSliderView.toString() + "");

        Intent intent = new Intent(this, FullScreenViewActivity.class);
        intent.putExtra("position", mViewSlider.getCurrentPosition());
        intent.putExtra("detailedListing", mDetailedListing);
        startActivity(intent);
    }



}
