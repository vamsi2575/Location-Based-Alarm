package com.example.mahe.geoalarmapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    CountDownTimer timer;
    private static int TIME_OUT = 11000; //Time to launch the another activity
    private Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(HomePage.this, MenuPage.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}
