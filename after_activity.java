package com.example.user.myapplication;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageButton;

public class after_activity extends AppCompatActivity {
    SoundPool soundf;
    int streamid;
    Button trd_but1, trd_but2, trd_but3, trd_but4, trd_but5, trd_but6, trd_but7, trd_but8, trd_but9, trd_but10, trd_but11, trd_but12, trd_but13, trd_but14;
    int trd_doo, trd_rae, trd_me, trd_pa, trd_sol, trd_la, trd_si, trd_doo_doo, trd_b_doo, trd_b_rae, trd_b_pa, trd_b_sol, trd_b_la, trd_b_doo_doo;

    ImageButton lleft;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_activity);//기본화면
///////////////
        soundf = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);//1은 한개의 사운드
        //2는 한번에 2개의 사운드 재생 audiomanager은 스트림타입 넣어줌 0은 음질
        trd_doo = soundf.load(this, R.raw.trd_doo, 1);//지금 자신의 클래스 가 제어권자
        //음악파일위치와 파일명 1은 우선순위
        trd_rae = soundf.load(this, R.raw.trd_rae, 1);
        trd_me = soundf.load(this, R.raw.trd_me, 1);
        trd_pa = soundf.load(this, R.raw.trd_pa, 1);
        trd_sol = soundf.load(this, R.raw.trd_sol, 1);
        trd_la = soundf.load(this, R.raw.trd_la, 1);
        trd_si = soundf.load(this, R.raw.trd_si, 1);
        trd_b_doo = soundf.load(this, R.raw.trd_b_doo, 1);
        trd_b_rae = soundf.load(this, R.raw.trd_b_rae, 1);
        trd_b_pa = soundf.load(this, R.raw.trd_b_pa, 1);
        trd_b_sol = soundf.load(this, R.raw.trd_b_sol, 1);
        trd_b_la = soundf.load(this, R.raw.trd_b_la, 1);

        lleft=(ImageButton)findViewById(R.id.imageButton2);
        lleft.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(after_activity.this, MainActivity.class);
                startActivity(intent);


            }
        });




        trd_but1 = (Button) findViewById(R.id.button1);
        trd_but1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundf.play(trd_doo, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });//setOnClickListener 눌렸을떄 이벤트 처리 버튼이 눌렸을떄 sound 객체 재생

        trd_but2 = (Button) findViewById(R.id.button2);
        trd_but2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_rae, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }

        });

        trd_but3 = (Button) findViewById(R.id.button3);
        trd_but3.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_me, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but4 = (Button) findViewById(R.id.button4);
        trd_but4.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_pa, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but5 = (Button) findViewById(R.id.button5);
        trd_but5.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_sol, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but6 = (Button) findViewById(R.id.button6);
        trd_but6.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_la, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but7 = (Button) findViewById(R.id.button7);
        trd_but7.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_si, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but8 = (Button) findViewById(R.id.button8);
        trd_but8.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_b_doo, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but9 = (Button) findViewById(R.id.button9);
        trd_but9.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_b_rae, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });
        trd_but10 = (Button) findViewById(R.id.button10);
        trd_but10.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_b_pa, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but11 = (Button) findViewById(R.id.button11);
        trd_but11.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_b_sol, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but12 = (Button) findViewById(R.id.button12);
        trd_but12.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_b_la, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but13 = (Button) findViewById(R.id.button13);
        trd_but13.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_doo_doo, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        trd_but14 = (Button) findViewById(R.id.button14);
        trd_but14.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(trd_b_doo_doo, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

    }
}