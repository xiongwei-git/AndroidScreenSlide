package com.ted.androidscreenslide.app;

import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * Created by Ted on 2015/3/8.
 */
public class AnimationPageTransformer implements ViewPager.PageTransformer {
    private static final float MIN_SCALE = 0.85f;
    private static final float MIN_ALPHA = 0.5f;

    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();
        int pageHeight = view.getHeight();
        if(view.getId() == R.id.slide_item_1){

            if (position < -1) {
                view.setAlpha(0);
            } else if (position <= 1) {
                view.setAlpha(1);
                View view1 = view.findViewById(R.id.slide_item_1_view_1);
                View view2 = view.findViewById(R.id.slide_item_1_view_2);
                View view3 = view.findViewById(R.id.slide_item_1_view_3);

                view1.setTranslationY(position*pageHeight/2);
                view2.setTranslationX(position*pageWidth/2);
                view3.setTranslationY(-position*pageHeight/2);

            } else {
                view.setAlpha(0);
            }
        }else if(view.getId() == R.id.slide_item_2){

            if (position < -1) {
                view.setAlpha(0);
            } else if (position <= 1) {
                view.setAlpha(1);
                View view1 = view.findViewById(R.id.slide_item_2_view_1);
                View view2 = view.findViewById(R.id.slide_item_2_view_2);
                View view3 = view.findViewById(R.id.slide_item_2_view_3);

                view1.setTranslationY(position * pageHeight/2);
                view2.setTranslationX(position * pageWidth / 2);
                view3.setTranslationY(-position * pageHeight / 2);

            } else {
                view.setAlpha(0);
            }
        }else if(view.getId() == R.id.slide_item_3){

            if (position < -1) {
                view.setAlpha(0);
            } else if (position <= 1) {
                view.setAlpha(1);
                View view1 = view.findViewById(R.id.slide_item_3_view_1);
                View view2 = view.findViewById(R.id.slide_item_3_view_2);
                View view3 = view.findViewById(R.id.slide_item_3_view_3);

                view1.setTranslationY(position * pageHeight/2);
                view2.setTranslationX(position * pageWidth / 2);
                view3.setTranslationY(-position * pageHeight / 2);

            } else {
                view.setAlpha(0);
            }
        }
    }
}
