package com.example.jalvarado.slidertest;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.daimajia.slider.library.Indicators.PagerIndicator;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.DefaultSliderView;

import java.util.List;


public class AlternativeFullScreenImageActivity extends AppCompatActivity {

    private SliderLayout mSliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alternative_full_screen_image);

        mSliderView = (SliderLayout) findViewById(R.id.slider_full_screen);

        Intent intent = getIntent();
        int position = intent.getIntExtra("position", 0);
        DetailedListing listing = intent.getParcelableExtra("detailedListing");



        final List<DetailedListing.ListingImage> images = listing.getListingImages();

        for (DetailedListing.ListingImage listingImage : images){
            DefaultSliderView sliderView = new DefaultSliderView(this);
            sliderView.image(listingImage.getFileName())
                    .setScaleType(BaseSliderView.ScaleType.FitCenterCrop);

            mSliderView.addSlider(sliderView);
        }
        mSliderView.setPresetTransformer(SliderLayout.Transformer.Default);
        mSliderView.setIndicatorVisibility(PagerIndicator.IndicatorVisibility.Invisible);
        mSliderView.stopAutoCycle();
        mSliderView.setCurrentPosition(position);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_alternative_full_screen_image, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
