package com.sun.multipleselector.acitivity;

import java.util.ArrayList;
import java.util.Collection;

import com.example.multipleselector.R;
import com.sun.multipleselector.impl.MultipleItemSelector;
import com.sun.multipleselector.impl.MultipleItemSelector.OnClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.content.DialogInterface;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity implements MultipleItemSelector.OnClickListener<String>{

	private static final String TAG = MainActivity.class.getName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Some random text");
		strings.add("Another item");
		strings.add("yet another");
		
		MultipleItemSelector<String> multiple = new MultipleItemSelector<String>(this, 
				R.layout.multiple_selector, R.id.item_checkbox, R.id.item_text, strings,
				this);

		multiple.showDialog();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onNegativeClick(DialogInterface dialog, int which) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPositiveClick(Collection<String> selectedItems_,
			DialogInterface dialog_, int which_) {
		for(String s : selectedItems_){
			Log.v(TAG, s);
		}
		
		
	}

}
