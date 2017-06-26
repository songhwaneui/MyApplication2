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


public class before_activity extends AppCompatActivity {
    SoundPool soundf;
    int streamid=0;

    Button fir_but1, fir_but2, fir_but3, fir_but4, fir_but5, fir_but6, fir_but7, fir_but8, fir_but9, fir_but10, fir_but11, fir_but12, fir_but13, fir_but14;
    int fir_doo, fir_rae, fir_me, fir_pa, fir_sol, fir_la, fir_si, fir_doo_doo, fir_b_doo, fir_b_rae, fir_b_pa, fir_b_sol, fir_b_la, fir_b_doo_doo;

    ImageButton rright;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_activity);


        soundf = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);//1은 한개의 사운드
        //2는 한번에 2개의 사운드 재생 audiomanager은 스트림타입 넣어줌 0은 음질
        fir_doo = soundf.load(this, fir_doo, 1);//지금 자신의 클래스 가 제어권자
        //음악파일위치와 파일명 1은 우선순위
        fir_rae = soundf.load(this, fir_rae, 1);
        fir_me = soundf.load(this, fir_me, 1);
        fir_pa = soundf.load(this, fir_pa, 1);
        fir_sol = soundf.load(this, fir_sol, 1);
        fir_la = soundf.load(this, fir_la, 1);
        fir_si = soundf.load(this, fir_si, 1);
        fir_b_doo = soundf.load(this, fir_b_doo, 1);
        fir_b_rae = soundf.load(this, fir_b_rae, 1);
        fir_b_pa = soundf.load(this, fir_b_pa, 1);
        fir_b_sol = soundf.load(this, fir_b_sol, 1);
        fir_b_la = soundf.load(this, fir_b_la, 1);


        rright=(ImageButton)findViewById(R.id.imageButton3);
        rright.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(before_activity.this, MainActivity.class);
                startActivity(intent);
            }
        });


        fir_but1 = (Button) findViewById(R.id.button1);
        fir_but1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    soundf.play(fir_doo, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });//setOnClickListener 눌렸을떄 이벤트 처리 버튼이 눌렸을떄 sound 객체 재생

        fir_but2 = (Button) findViewById(R.id.button2);
        fir_but2.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_rae, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }

        });

        fir_but3 = (Button) findViewById(R.id.button3);
        fir_but3.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_me, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but4 = (Button) findViewById(R.id.button4);
        fir_but4.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_pa, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but5 = (Button) findViewById(R.id.button5);
        fir_but5.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_sol, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but6 = (Button) findViewById(R.id.button6);
        fir_but6.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_la, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but7 = (Button) findViewById(R.id.button7);
        fir_but7.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_si, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but8 = (Button) findViewById(R.id.button8);
        fir_but8.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_b_doo, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but9 = (Button) findViewById(R.id.button9);
        fir_but9.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_b_rae, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });
        fir_but10 = (Button) findViewById(R.id.button10);
        fir_but10.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_b_pa, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but11 = (Button) findViewById(R.id.button11);
        fir_but11.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_b_sol, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but12 = (Button) findViewById(R.id.button12);
        fir_but12.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_b_la, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but13 = (Button) findViewById(R.id.button13);
        fir_but13.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_doo_doo, 1, 1, 0, 0, 1);
                    return true;
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    soundf.stop(streamid);
                    return true;
                }
                return false;
            }
        });

        fir_but14 = (Button) findViewById(R.id.button14);
        fir_but14.setOnTouchListener(new OnTouchListener() {
            public boolean onTouch(View v, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                    streamid = soundf.play(fir_b_doo_doo, 1, 1, 0, 0, 1);
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

 /*
        public void onButton1Clicked(View v){
        Toast.makeText(this, "버튼이 눌렸어요.", Toast.LENGTH_LONG).show();}
        토스트 메시지 아)래에 메시지 잠깐보였다가 사라지도록

        soundf.play(a,b,c,d,e,f)
        a 구분자
        b 사운드 왼쪽볼륨
        c 사운드 오른쪽볼륨
        d 사운드 우선순위
        e 재생반복
        f 재생속도
*/
