package edu.Drake.assignmentdcollaborate;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * The third activity of the Collaboration project. 
 * Has the ability to switch back to the first or second screens. 
 * 
 * @author bvarberg
 */

public class ThirdActivity extends Activity {

	Button to_first;
	Button to_second;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		
		to_first = (Button) findViewById(R.id.buttonFirst);
		to_first.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), MainActivity.class);
				startActivity(intent);
			}
		});
		
		to_second = (Button) findViewById(R.id.buttonSecond);
		to_second.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(v.getContext(), SecondActivity.class);
				startActivity(intent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_third, menu);
		return true;
	}

}
