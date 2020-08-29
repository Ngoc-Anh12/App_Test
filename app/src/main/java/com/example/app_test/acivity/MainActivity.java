package com.example.app_test.acivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.telecom.Call;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.app_test.R;

public class MainActivity extends AppCompatActivity {
    private  static  int  SPLASH_TIME_OUT = 5000;
    ImageView logo;
    TextView title_logo,title_bla;
    Animation animation,bottom_animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //hooks
        logo=findViewById(R.id.logo);
        title_logo=findViewById(R.id.title_logo);
        title_bla=findViewById(R.id.title_bla);
       //animation call
        animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        bottom_animation=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        logo.setAnimation(animation);
        title_logo.setAnimation(animation);
        title_bla.setAnimation(bottom_animation);
    //call new activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        },SPLASH_TIME_OUT);


    }
}
