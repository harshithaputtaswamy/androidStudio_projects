package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button start, stop;
    TextView ctrVal;
    int counter = 0;
    int flag = 0;

    Handler handle = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = (Button) findViewById(R.id.start);
        stop = (Button) findViewById(R.id.stop);
        ctrVal = (TextView) findViewById(R.id.ctrVal);

        start.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                    handle.postDelayed(rn, 1000);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handle.removeCallbacks(rn);
                counter = 0;
            }
        });

//        start.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                while (flag == 0){
//                    ctrVal.setText(""+(counter++));
//                }
//            }
//        });
//
//        stop.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                flag = 1;
//            }
//        });
    }

    public Runnable rn = new Runnable() {
        @Override
        public void run() {
                counter++;
                ctrVal.setText(String.valueOf(counter));
                handle.postDelayed(rn,1000);
        }
    };
}

