package com.example.android.szegedguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new SzegedFragment();
            case 1:
                return new WhatToSeeFragment();
            case 2:
                return new WhereToStayFragment();
            case 3:
                return new WhatToTasteFragment();
            default:
                return new WhatToDoFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.szeged_fragment);
            case 1:
                return mContext.getString(R.string.what_to_see_fragment_title);
            case 2:
                return mContext.getString(R.string.where_to_stay_fragment_title);
            case 3:
                return mContext.getString(R.string.what_to_taste_fragment_title);
            default:
                return mContext.getString(R.string.what_to_do_fragment_title);
        }
    }
}
