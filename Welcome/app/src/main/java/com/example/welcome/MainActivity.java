package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.res);
    }

    public void disp1(View v)
    {
        tv.setText("Welcome to Bangalore Institute of Technology");
    }

    public void disp2(View v)
    {
        tv.setText("Welcome to Android Programming");
    }

}