package com.example.sharedelementtransition;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
  Button secondActBtn;
  ImageView sharedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        sharedView = (ImageView)findViewById(R.id.imageView1);
        secondActBtn = (Button)findViewById(R.id.button1);
        secondActBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
             	
					  ActivityOptionsCompat OptionsCompat= ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, sharedView,"shared_image");
					  Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				      startActivity(intent, OptionsCompat.toBundle());
			}
		});
    }
}
