package com.example.jc.waitress;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Julio Conchas on 12/5/16.
 */
public class SwipeAdapter extends FragmentStatePagerAdapter {

    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment menu_fragment = new menu();
        Bundle bundle = new Bundle();
        bundle.putInt("count",i+1);
        menu_fragment.setArguments(bundle);
        return menu_fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}
