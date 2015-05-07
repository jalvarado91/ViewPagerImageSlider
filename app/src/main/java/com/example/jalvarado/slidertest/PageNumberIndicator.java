package com.example.jalvarado.slidertest;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.daimajia.slider.library.Tricks.ViewPagerEx;

/**
 * Created by jalvarado on 5/7/15.
 */
public class PageNumberIndicator extends TextView implements ViewPagerEx.OnPageChangeListener {

    private Context mContext;

    public PageNumberIndicator(Context context) {
        this(context, null);
    }

    public PageNumberIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);

        mContext = context;

    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {

    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}
