package com.example.kctviewpage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    int images[] = {R.drawable.images_1,R.drawable.images_2,R.drawable.images_3};
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position){
        return ItemFragment.newInstance(images[position]);
    }

    @Override
    public int getCount() {
        return images.length;
    }
}
