package com.example.l.a108;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash_screen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable()
        {
            public void run()
            {
                Intent myIntent = new Intent(splash_screen.this,login.class);
                startActivity(myIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
