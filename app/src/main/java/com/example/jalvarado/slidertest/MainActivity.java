package com.example.jalvarado.slidertest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jalvarado.slidertest.utils.HttpUtil;
import com.example.jalvarado.slidertest.utils.NetworkUtil;
import com.squareup.okhttp.Response;

import org.json.JSONException;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private NetworkUtil mNetworkUtil;
    private HttpUtil mHttpUtil;
    private ListingViewPresenter mListingViewPresenter;
    private DetailedListing mDetailedListing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                                fillRestOfDetails();
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

    private void fillRestOfDetails() {

    }

}
