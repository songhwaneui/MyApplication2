package com.example.user.myapplication;

import android.media.AudioAttributes;
import android.net.rtp.AudioStream;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.AudioManager;
import android.media.SoundPool;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    SoundPool soundf;
    Button but1, but2, but3, but4, but5, but6, but7;
    int doo,rae, me, pa, sol, la, si;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        soundf = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
        doo = soundf.load(this, R.raw.doo,1);
        rae = soundf.load(this, R.raw.rae,1);
        me = soundf.load(this, R.raw.me,1);
        pa = soundf.load(this, R.raw.pa,1);
        sol = soundf.load(this, R.raw.sol,1);
        la = soundf.load(this, R.raw.la,1);
        si = soundf.load(this, R.raw.si,1);


        but1=(Button)findViewById(R.id.button);
        but1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(doo,1,1,0,0,1);
            }
        });

        but2=(Button)findViewById(R.id.button);
        but2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(rae,1,1,0,0,1);
            }
        });
        but3=(Button)findViewById(R.id.button);
        but3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(me,1,1,0,0,1);
            }
        });

        but4=(Button)findViewById(R.id.button);
        but4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(pa,1,1,0,0,1);
            }
        });

        but5=(Button)findViewById(R.id.button);
        but5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sol,1,1,0,0,1);
            }
        });

        but6=(Button)findViewById(R.id.button);
        but6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(la,1,1,0,0,1);
            }
        });

        but7=(Button)findViewById(R.id.button);
        but7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(si,1,1,0,0,1);
            }
        });
    }
}

