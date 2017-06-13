package com.example.user.myapplication;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    SoundPool soundf;
    Button sec_but1, sec_but2, sec_but3, sec_but4, sec_but5, sec_but6, sec_but7, sec_but8, sec_but9, sec_but10, sec_but11, sec_but12, sec_but13, sec_but14;
    int sec_doo,sec_rae, sec_me, sec_pa, sec_sol, sec_la, sec_si, sec_doo_doo, sec_b_doo, sec_b_rae, sec_b_pa, sec_b_sol, sec_b_la, sec_b_doo_doo;

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
        sec_doo = soundf.load(this, R.raw.sec_doo,1);//지금 자신의 클래스 가 제어권자
        //음악파일위치와 파일명 1은 우선순위
        sec_rae = soundf.load(this, R.raw.sec_rae,1);
        sec_me = soundf.load(this, R.raw.sec_me,1);
        sec_pa = soundf.load(this, R.raw.sec_pa,1);
        sec_sol = soundf.load(this, R.raw.sec_sol,1);
        sec_la = soundf.load(this, R.raw.sec_la,1);
        sec_si = soundf.load(this, R.raw.sec_si,1);
        sec_b_doo=soundf.load(this, R.raw.sec_b_doo,1);
        sec_b_rae=soundf.load(this, R.raw.sec_b_rae,1);
        sec_b_pa=soundf.load(this, R.raw.sec_b_pa,1);
        sec_b_sol=soundf.load(this, R.raw.sec_b_sol,1);
        sec_b_la=soundf.load(this, R.raw.sec_b_la,1);


        sec_but1 =(Button)findViewById(R.id.button1);
        sec_but1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_doo,1,1,0,0,1);
            }
        });//setOnClickListener 눌렸을떄 이벤트 처리 버튼이 눌렸을떄 sound 객체 재생

        sec_but2=(Button)findViewById(R.id.button2);
        sec_but2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_rae,1,1,0,0,1);
            }
        });

        sec_but3=(Button)findViewById(R.id.button3);
        sec_but3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_me,1,1,0,0,1);
            }
        });

        sec_but4=(Button)findViewById(R.id.button4);
        sec_but4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_pa,1,1,0,0,1);
            }
        });

        sec_but5=(Button)findViewById(R.id.button5);
        sec_but5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_sol,1,1,0,0,1);
            }
        });

        sec_but6=(Button)findViewById(R.id.button6);
        sec_but6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_la,1,1,0,0,1);
            }
        });

        sec_but7=(Button)findViewById(R.id.button7);
        sec_but7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_si,1,1,0,0,1);
            }
        });

        sec_but8=(Button)findViewById(R.id.button8);
        sec_but8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_b_doo,1,1,0,0,1);
            }
        });

        sec_but9=(Button)findViewById(R.id.button9);
        sec_but9.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_b_rae,1,1,0,0,1);
            }
        });

        sec_but10=(Button)findViewById(R.id.button10);
        sec_but10.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_b_pa,1,1,0,0,1);
            }
        });

        sec_but11=(Button)findViewById(R.id.button11);
        sec_but11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_b_sol,1,1,0,0,1);
            }
        });

        sec_but12=(Button)findViewById(R.id.button12);
        sec_but12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_b_la,1,1,0,0,1);
            }
        });

        sec_but13=(Button)findViewById(R.id.button13);
        sec_but13.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_doo_doo,1,1,0,0,1);
            }
        });

        sec_but14=(Button)findViewById(R.id.button14);
        sec_but14.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                soundf.play(sec_b_doo_doo,1,1,0,0,1);
            }
        });
        /*
        mFrame.setOnTouchListener(new View.OnTouchListener() {
            float distance;
            @Override
            public boolean onTouch(View v, MotionEvent event) {


                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
// 손가락을 touch 했을 떄 x 좌표값 저장
                        pressedX = event.getX();
                        break;
                    case MotionEvent.ACTION_UP:
// 손가락을 떼었을 때 저장해놓은 x좌표와의 거리 비교
                       distance = pressedX - event.getX();
                        break;
                }

// 해당 거리가 100이 되지 않으면 이벤트 처리 하지 않는다.
                if (Math.abs(distance) < 100) {
                    return false;
                }

                if (distance > 0) {
// 손가락을 왼쪽으로 움직였으면 오른쪽 화면이 나타나야 한다.
                    Intent intent = new Intent(MainActivity.this, after_activity.class);
                    startActivity(intent);
                } else {
// 손가락을 오른쪽으로 움직였으면 왼쪽 화면이 나타나야 한다.
                    Intent intent = new Intent(MainActivity.this, before_activity.class);
                    startActivity(intent);
                }

                finish(); // finish 해주지 않으면 activity가 계속 쌓인다.

                return true;
            }
        });
        */







       }
    }

 /*
        public void onButton1Clicked(View v){
        Toast.makeText(this, "버튼이 눌렸어요.", Toast.LENGTH_LONG).show();}
        토스트 메시지 아래에 메시지 잠깐보였다가 사라지도록

        soundf.play(a,b,c,d,e,f)
        a 구분자
        b 사운드 왼쪽볼륨
        c 사운드 오른쪽볼륨
        d 사운드 우선순위
        e 재생반복
        f 재생속도
*/