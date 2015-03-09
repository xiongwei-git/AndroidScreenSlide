package com.ted.androidscreenslide.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import github.chenupt.springindicator.SpringIndicator;

import java.util.ArrayList;

/**
 * Created by Ted on 2015/3/9.
 */
public class AdvancedScreenSlideActivity extends FragmentActivity{
    private ViewPager mViewPager;
    private ArrayList<View> mViewList;
    private SpringIndicator mSpringIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.advanced_activity_screen_slide);
        initViews();
    }

    private void initViews(){
        mViewPager = (ViewPager)findViewById(R.id.view_pager);
        mSpringIndicator = (SpringIndicator)findViewById(R.id.indicator);
        LayoutInflater lf = LayoutInflater.from(this);
        View view1 = lf.inflate(R.layout.slide_item_1, null);
        View view2 = lf.inflate(R.layout.slide_item_2, null);
        View view3 = lf.inflate(R.layout.slide_item_3, null);
        mViewList = new ArrayList<View>();
        mViewList.add(view1);
        mViewList.add(view2);
        mViewList.add(view3);
        SlidePageAdapter adapter = new SlidePageAdapter();
        mViewPager.setAdapter(adapter);
        mSpringIndicator.setViewPager(mViewPager);
        mViewPager.setPageTransformer(true,new AnimationPageTransformer());
        //PagerModelManager modelManager;
    }


    private class SlidePageAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            return mViewList.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return view == o;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(mViewList.get(position));
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(mViewList.get(position));
            return mViewList.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return (position+1)+"";
        }
    }
}
