package com.example.android.anaheimtourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ThemeParksFragment();
        } else if (position == 1) {
            return new LandmarksFragment();
        } else if (position == 2) {
            return new FoodsFragment();
        } else {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.theme_parks);
        } else if (position == 1) {
            return mContext.getString(R.string.landmarks);
        } else if (position == 2) {
            return mContext.getString(R.string.foods);
        } else {
            return mContext.getString(R.string.hotels);
        }
    }
}