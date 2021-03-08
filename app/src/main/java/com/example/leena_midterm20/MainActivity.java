package com.example.leena_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;
    int playing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bttnAct2=(Button)findViewById(R.id.button2) ;
        Button bttnAct3=(Button)findViewById(R.id.button3) ;
        mp= MediaPlayer.create(this,R.raw.track1);
        ImageView kuwala=(ImageView)findViewById(R.id.imageView2);
        kuwala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            switch (playing){
                case 0:
                    mp.start();
                    playing=1;
                    break;
                case 1:
                    mp.pause();
                    playing=0;
                    break;

            }
            }
        });

        bttnAct2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Act2.class));
            }
        });
        bttnAct3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Act3.class));
            }
        });
    }

}