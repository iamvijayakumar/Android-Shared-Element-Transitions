package com.example.sharedelementtransition;



import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
  Button secondActBtn;
  ImageView sharedView,sharedView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        sharedView = (ImageView)findViewById(R.id.imageView1);
        sharedView1 = (ImageView)findViewById(R.id.imageView2);
        secondActBtn = (Button)findViewById(R.id.button1);
        secondActBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View vd) {
				
				   //Single Element Share
					/*  ActivityOptionsCompat OptionsCompat= ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, sharedView,"shared_image");
					  Intent intent = new Intent(MainActivity.this, SecondActivity.class);
				      startActivity(intent, OptionsCompat.toBundle());*/
			
				
				
				//Multi Element Share 
				View v = (ImageView)findViewById(R.id.imageView1);
				View v2 = (ImageView)findViewById(R.id.imageView2);
				Pair<View, String> p1 = Pair.create(v, "shared_image");
				Pair<View, String> p2 = Pair.create(v2, "shared_image1");
				@SuppressWarnings("unchecked")
				ActivityOptionsCompat OptionsCompat= ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this, p1,  p2);
				  Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			      startActivity(intent, OptionsCompat.toBundle());
			      
			  
			}
		});
    }
}
