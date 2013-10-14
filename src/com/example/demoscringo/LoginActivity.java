package com.example.demoscringo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class LoginActivity extends FragmentActivity {
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
			setContentView(R.layout.login_screen);
			Intent intent = getIntent();
			String value = intent.getStringExtra("welcomeFragment");
			 FragmentManager fm = getSupportFragmentManager();
		        Fragment fragment = fm.findFragmentById(R.id.LoginFragmentContainer);
		        if (fragment == null) {
		            fragment = new LoginFragment();
		            fm.beginTransaction()
		                .add(R.id.LoginFragmentContainer, fragment)
		              
		                	
		                .commit(); 
		     
		            }

	    }

}
