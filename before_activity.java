package com.example.user.myapplication;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class before_activity extends AppCompatActivity {
    SoundPool soundf;
    Button fir_but1, fir_but2, fir_but3, fir_but4, fir_but5, fir_but6, fir_but7, fir_but8, fir_but9, fir_but10, fir_but11, fir_but12, fir_but13, fir_but14;
    int fir_doo, fir_rae, fir_me, fir_pa, fir_sol, fir_la, fir_si, fir_doo_doo, fir_b_doo, fir_b_rae, fir_b_pa, fir_b_sol, fir_b_la, fir_b_doo_doo;

    /*
    LinearLayout mFrame;
    float pressedX;
    */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//기본화면

        soundf = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);//1은 한개의 사운드
        //2는 한번에 2개의 사운드 재생 audiomanager은 스트림타입 넣어줌 0은 음질
        fir_doo = soundf.load(this, R.raw.fir_doo, 1);//지금 자신의 클래스 가 제어권자
        //음악파일위치와 파일명 1은 우선순위
        fir_rae = soundf.load(this, R.raw.fir_rae, 1);
        fir_me = soundf.load(this, R.raw.fir_me, 1);
        fir_pa = soundf.load(this, R.raw.fir_pa, 1);
        fir_sol = soundf.load(this, R.raw.fir_sol, 1);
        fir_la = soundf.load(this, R.raw.fir_la, 1);
        fir_si = soundf.load(this, R.raw.fir_si, 1);
        fir_b_doo = soundf.load(this, R.raw.fir_b_doo, 1);
        fir_b_rae = soundf.load(this, R.raw.fir_b_rae, 1);
        fir_b_pa = soundf.load(this, R.raw.fir_b_pa, 1);
        fir_b_sol = soundf.load(this, R.raw.fir_b_sol, 1);
        fir_b_la = soundf.load(this, R.raw.fir_b_la, 1);


        fir_but1 = (Button) findViewById(R.id.button1);
        fir_but1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_doo, 1, 1, 0, 0, 1);
            }
        });//setOnClickListener 눌렸을떄 이벤트 처리 버튼이 눌렸을떄 sound 객체 재생

        fir_but2 = (Button) findViewById(R.id.button2);
        fir_but2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_rae, 1, 1, 0, 0, 1);
            }
        });

        fir_but3 = (Button) findViewById(R.id.button3);
        fir_but3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_me, 1, 1, 0, 0, 1);
            }
        });

        fir_but4 = (Button) findViewById(R.id.button4);
        fir_but4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_pa, 1, 1, 0, 0, 1);
            }
        });

        fir_but5 = (Button) findViewById(R.id.button5);
        fir_but5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_sol, 1, 1, 0, 0, 1);
            }
        });

        fir_but6 = (Button) findViewById(R.id.button6);
        fir_but6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_la, 1, 1, 0, 0, 1);
            }
        });

        fir_but7 = (Button) findViewById(R.id.button7);
        fir_but7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_si, 1, 1, 0, 0, 1);
            }
        });

        fir_but8 = (Button) findViewById(R.id.button8);
        fir_but8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_b_doo, 1, 1, 0, 0, 1);
            }
        });

        fir_but9 = (Button) findViewById(R.id.button9);
        fir_but9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_b_rae, 1, 1, 0, 0, 1);
            }
        });

        fir_but10 = (Button) findViewById(R.id.button10);
        fir_but10.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_b_pa, 1, 1, 0, 0, 1);
            }
        });

        fir_but11 = (Button) findViewById(R.id.button11);
        fir_but11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_b_sol, 1, 1, 0, 0, 1);
            }
        });

        fir_but12 = (Button) findViewById(R.id.button12);
        fir_but12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_b_la, 1, 1, 0, 0, 1);
            }
        });

        fir_but13 = (Button) findViewById(R.id.button13);
        fir_but13.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_doo_doo, 1, 1, 0, 0, 1);
            }
        });

        fir_but14 = (Button) findViewById(R.id.button14);
        fir_but14.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(fir_b_doo_doo, 1, 1, 0, 0, 1);
            }
        });
    }
}