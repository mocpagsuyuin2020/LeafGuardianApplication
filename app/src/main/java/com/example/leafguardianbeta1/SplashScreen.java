package com.example.leafguardianbeta1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
            public void onTick(long millisUntilFinished) {
                // Code to be executed when the timer is ticking

            }

            public void onFinish() {
                // Code to be executed when the timer finishes
                Intent intent = new Intent(SplashScreen.this, StartScreen.class);
                startActivity(intent);
            }
        };
        countDownTimer.start();

    }
}