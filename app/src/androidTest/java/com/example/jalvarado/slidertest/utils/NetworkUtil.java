package com.example.jalvarado.slidertest.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;


public class NetworkUtil {

    private Context mContext;
    private ConnectivityManager manager;
    private NetworkInfo networkInfo;

    public NetworkUtil(Context context) {
        mContext = context;
        manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        networkInfo = manager.getActiveNetworkInfo();
    }

    public boolean isNetworkAvailable() {
        boolean isAvailable = false;
        if(networkInfo != null && networkInfo.isConnected()) {
            isAvailable = true;
        }
        return isAvailable;
    }
}
