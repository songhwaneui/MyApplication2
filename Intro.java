package com.example.user.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Intro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
        ImageButton start;
        start=(ImageButton)findViewById(R.id.imageButton4);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intro.this, MainActivity.class);
                startActivity(intent);

            }
        });



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            public void run() {
            Intent intent = new Intent(Intro.this, MainActivity.class);
            startActivity(intent);
            finish();
          }
        }, 5000);
        }
    }

