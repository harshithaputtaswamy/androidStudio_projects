package com.example.wallpaper;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    int[] images;
    Button btn;
    View screenView;
    Timer count;
    WallpaperManager wpm;
    Drawable draw;
    int next = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        images = new int[]{R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10};
        btn = findViewById(R.id.btn);
        screenView = findViewById(R.id.LinearView);
        count = new Timer();
        wpm = WallpaperManager.getInstance(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setWallpaper();
            }
        });
    }

    public void setWallpaper(){
        count.schedule(new TimerTask() {
            @Override
            public void run() {

                int len = images.length;
                Random rand = new Random();
                int randNum = rand.nextInt(len);
//                screenView.setBackground(ContextCompat.getDrawable(getApplicationContext(), images[randNum]));
                draw = getResources().getDrawable(images[randNum]);

                Bitmap imp = ((BitmapDrawable)draw).getBitmap();

                try {
                    wpm.setBitmap(imp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }, 30000,5000);
    }
}