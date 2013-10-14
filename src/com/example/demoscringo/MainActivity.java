package com.example.demoscringo;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.widget.TextView;

import com.scringo.Scringo;

public class MainActivity extends FragmentActivity {
	Scringo scringo = new Scringo(this);
	
	private static final String TAG = "a";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		 FragmentManager fm = getSupportFragmentManager();
	        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

	        if (fragment == null) {
	            fragment = new welcomeFragment();
	            fm.beginTransaction()
	                .add(R.id.fragmentContainer, fragment)
	                .commit(); 
	            }

		scringo.init();

	}
	

	@Override
	protected void onStart() {
		super.onStart();
		scringo.onStart();
		
	}

	@Override
	protected void onStop() {
		super.onStop();
		scringo.onStop();
	}

	@Override
	public void onBackPressed() {
		if (!scringo.onBackPressed()) {
			super.onBackPressed();
		}
	}
}
