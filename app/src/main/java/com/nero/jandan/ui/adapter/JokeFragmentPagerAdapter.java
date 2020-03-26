package com.nero.jandan.ui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.nero.jandan.qsbk.QsbkFragment;
import com.nero.jandan.qsbk.QsbkPresenter;
import com.nero.jandan.ui.fragment.FreshNewsPostsFragment;

/**
 * Created by Lizhaotailang on 2016/8/5.
 */


public class JokeFragmentPagerAdapter extends FragmentPagerAdapter {

    private String[] titles = {"糗事百科", "煎蛋","内涵段子" };
    private Context context;

    public JokeFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 1){
            FreshNewsPostsFragment fragment =new FreshNewsPostsFragment();
            return fragment;
        } else if (position == 2){
            QsbkFragment fragment = QsbkFragment.newInstance(1);
            new QsbkPresenter(context, fragment);
            return fragment;
        }
        QsbkFragment fragment = QsbkFragment.newInstance(1);
        new QsbkPresenter(context, fragment);
 //       FreshNewsPostsFragment fragment =new FreshNewsPostsFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

}
