package com.example.demoscringo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

import com.scringo.Scringo;
import com.scringo.ScringoActivationButton;

public class MainActivity extends Activity {
	Scringo scringo = new Scringo(this);
	private static final String TAG = "QuizActivity";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		scringo.init();
	//	Scringo.setDebugMode(true);
		Scringo.preloadChatRooms();
		Scringo.openChatRooms(this);
	//	String a=Scringo.getUserId();
	//	Log.d(TAG,a);
		((ScringoActivationButton) findViewById(R.id.activationButton2)).setScringo(scringo);
//		((ScringoActivationButton) findViewById(R.id.activationButton1)).setScringo(scringo);

	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);

		return true;
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
