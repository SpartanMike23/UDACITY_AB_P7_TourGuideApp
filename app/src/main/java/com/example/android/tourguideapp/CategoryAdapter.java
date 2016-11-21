package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Michael on 9/7/16.
 */
public class CategoryAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 4;

    private Context mContext;

    public CategoryAdapter (FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    private int[] imageResId = {
            R.drawable.ic_shopping_basket_black
    };

    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new ManilaMenuFragment();
        }
        if (position == 1){
            return new RestaurantsFragments();
        }
        if (position == 2){
            return new EventsFragment();
        } else {
            return new PublicPlacesFragments();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.about_tab_text);
        }
        if (position == 1) {
            return mContext.getString(R.string.food_tab_text);
        }
        if (position == 2) {
            return mContext.getString(R.string.events_app_bar_text);
        } else {
            return mContext.getString(R.string.public_places_app_bar_text);
        }
    }


}
