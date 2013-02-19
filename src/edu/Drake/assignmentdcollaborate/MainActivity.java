package edu.Drake.assignmentdcollaborate;

import edu.Drake.assignmentdcollaborate.R;
import edu.Drake.assignmentdcollaborate.SecondActivity;
import edu.Drake.assignmentdcollaborate.ThirdActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private static final String TAG = "MainActivity";

	Button button;
	Button buttonToThird;
	int myVariable = 0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				myVariable++;
				Log.v(TAG, "page 1 buttons pressed " + myVariable + " times");
				Intent intent = new Intent(v.getContext(), SecondActivity.class);
				startActivity(intent);
			}
		});
		buttonToThird = (Button) findViewById(R.id.button2);
		buttonToThird.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				myVariable++;
				Log.v(TAG, "page 1 buttons pressed " + myVariable + " times");
				Intent intent = new Intent(v.getContext(), ThirdActivity.class);
				startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	

}
