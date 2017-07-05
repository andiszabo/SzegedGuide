package com.example.android.szegedguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private static final int POSITION_WELCOME = 0;
    private static final int POSITION_ATTRACTION = 1;
    private static final int POSITION_ACCOMODATION = 2;
    private static final int POSITION_RESTAURANT = 3;
    private static final int NUMBER_OF_POSITIONS = POSITION_RESTAURANT + 1;

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (POSITION_WELCOME == position) {
            return new SzegedFragment();
        } else if (POSITION_ATTRACTION == position) {
            return new WhatToSeeFragment();
        } else if (POSITION_ACCOMODATION == position) {
            return new WhereToStayFragment();
        } else {
            return new WhatToTasteFragment();
        }
    }

    @Override
    public int getCount() {
        return NUMBER_OF_POSITIONS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (POSITION_WELCOME == position) {
            return mContext.getString(R.string.szeged_fragment);
        } else if (POSITION_ATTRACTION == position) {
            return mContext.getString(R.string.what_to_see_fragment_title);
        } else if (POSITION_ACCOMODATION == position) {
            return mContext.getString(R.string.where_to_stay_fragment_title);
        } else {
            return mContext.getString(R.string.what_to_taste_fragment_title);
        }
    }
}
