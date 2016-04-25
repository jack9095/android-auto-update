package com.loveplusplus.update.sample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.loveplusplus.update.UpdateChecker;

/**
 * 版本更新
 *  Constants 参数修改全在这个类中 。这个类在引用库中
 */
public class MainActivity extends ActionBarActivity {

    protected static final String APP_UPDATE_SERVER_URL = "http://192.168.205.33:8080/Hello/api/update";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button btn1 = (Button) findViewById(R.id.button1);
		Button btn2 = (Button) findViewById(R.id.button2);

		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				UpdateChecker.checkForDialog(MainActivity.this,APP_UPDATE_SERVER_URL);
			}
		});
		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				UpdateChecker.checkForNotification(MainActivity.this,APP_UPDATE_SERVER_URL);
			}
		});

	}

}
