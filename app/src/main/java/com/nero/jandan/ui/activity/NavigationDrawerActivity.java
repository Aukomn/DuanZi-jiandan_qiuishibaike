package com.nero.jandan.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.nero.jandan.JanDanApplication;
import com.nero.jandan.R;
import com.nero.jandan.injector.component.ApplicationComponent;
import com.nero.jandan.ui.fragment.MainFragment;

public class NavigationDrawerActivity extends BaseActivity{

	@Override
	protected int getContentViewLayoutId(){
		return R.layout.activity_navigation_drawer;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
//		getSupportFragmentManager().beginTransaction().replace(R.id.container, new MainFragment()).commit();
		freshUI();
	}

	private void freshUI(){
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

		Fragment fragment = fragmentManager.findFragmentByTag(MainFragment.TAG);
		if(fragment == null){
			fragment = new MainFragment();
			fragmentTransaction.add(R.id.container,fragment,MainFragment.TAG);
		}else{
			fragmentTransaction.attach(fragment);
		}

		fragmentTransaction.commit();
	}

	public ApplicationComponent getApplicationComponent(){
		ApplicationComponent applicationComponent = ((JanDanApplication)getApplication()).getApplicationComponent();
		return applicationComponent;
	}

	@Override
	public void onBackPressed(){
		super.onBackPressed();
		startActivity(new Intent(this,DummyActivity.class));
		finish();
	}
}
