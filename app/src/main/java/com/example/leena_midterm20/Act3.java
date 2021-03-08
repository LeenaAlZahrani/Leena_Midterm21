package com.example.leena_midterm20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.leena_midterm20.R;
import com.example.leena_midterm20.Splash;

public class Act3 extends AppCompatActivity {
    MediaPlayer mp;
    int playing;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act3);
        listView=(ListView)findViewById(R.id.lv);
        mp=new MediaPlayer();
        mp=MediaPlayer.create(this,R.raw.track1);

        String[]imgs= {
                "First","Second","Third","Forth",
        };
        ArrayAdapter<String> adapter=new  ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, imgs);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http:/alfaisal.com")));
                        break;
                    case 1: startActivity(new Intent(Act3.this, lionpic.class));
                        break;
                    case 2:mp.start();

                    case 3: startActivity(new Intent(Act3.this,Splash.class));
                }}
        });

    }
}