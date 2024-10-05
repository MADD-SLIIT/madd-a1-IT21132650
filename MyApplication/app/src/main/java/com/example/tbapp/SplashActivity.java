package com.example.tbapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        int SPLASH_DISPLAY_LENGTH = 3000; // Splash screen will show for 3 seconds

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent onboardIntent = new Intent(SplashActivity.this, OnboardActivity.class);
                startActivity(onboardIntent);
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
