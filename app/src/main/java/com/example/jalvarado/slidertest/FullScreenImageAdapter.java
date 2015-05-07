package com.example.jalvarado.slidertest;

import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class FullScreenImageAdapter extends PagerAdapter{

    private Activity mActivity;
    private List<DetailedListing.ListingImage> mImages;
    private LayoutInflater mInflater;

    public FullScreenImageAdapter(Activity activity, List<DetailedListing.ListingImage> images) {
        mActivity = activity;
        mImages = images;
    }

    @Override
    public int getCount() {
        return mImages.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((RelativeLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imgDisplay;
        TextView imageCounter;

        mInflater = LayoutInflater.from(mActivity);

        View viewLayout = mInflater.inflate(R.layout.layout_fullscreen_image, container, false);

        imgDisplay = (ImageView) viewLayout.findViewById(R.id.img_display);
        imageCounter = (TextView) viewLayout.findViewById(R.id.tv_image_counter);

        Picasso.with(mActivity).load(mImages.get(position).getFileName()).into(imgDisplay);
        imageCounter.setText((position+1) + "/" +mImages.size());

        ((ViewPager) container).addView(viewLayout);

        return viewLayout;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((RelativeLayout) object);
    }
}
