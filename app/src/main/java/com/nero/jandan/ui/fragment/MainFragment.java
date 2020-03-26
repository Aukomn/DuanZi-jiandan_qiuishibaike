package com.nero.jandan.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nero.jandan.R;
import com.nero.jandan.ui.adapter.JokeFragmentPagerAdapter;

public class MainFragment extends Fragment {
    public MainFragment() {

    }
    public static final String TAG = MainFragment.class.getSimpleName();
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(new JokeFragmentPagerAdapter(getChildFragmentManager(), getContext()));
        TabLayout tabLayout = (TabLayout)view.findViewById(R.id.tabs);
         tabLayout.setupWithViewPager(viewPager);
        return view;
    }
}
