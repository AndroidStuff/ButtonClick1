package com.karthik;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener { //Class implements OnClickListener
	private static final String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button_click_me = (Button) findViewById(R.id.activity_main_button_click_me);
		button_click_me.setOnClickListener(this); //Attaching OnClickListener to Button 
		
		Button button_click_me_too = (Button) findViewById(R.id.activity_main_button_click_me_too);
		button_click_me_too.setOnClickListener(this); //Attaching OnClickListener to Button
	}

	@Override
	public void onClick(View v) { // Define the OnClick event
		switch (v.getId()) {
		case R.id.activity_main_button_click_me:
			Log.d(TAG, "Button Click Me, is clicked");
			break;
		case R.id.activity_main_button_click_me_too:
			Log.d(TAG, "Button Click Me Too, is clicked");
			break;
		default:
			Log.d(TAG, "some unknown button is clicked :(");
		}
	}

}
