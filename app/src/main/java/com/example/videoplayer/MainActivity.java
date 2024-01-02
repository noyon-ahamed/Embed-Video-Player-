package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout laysong1,laysong2,layson3,laysong4;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        laysong1=findViewById(R.id.laysong1);
        laysong2=findViewById(R.id.laysong2);
        layson3=findViewById(R.id.laysong3);
        laysong4=findViewById(R.id.laysong4);

        laysong1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VideoView.video_url="https://www.youtube.com/embed/4fv97kz_k9g";
                Intent mintent=new Intent(MainActivity.this,VideoView.class);
                startActivity(mintent);
            }
        });

        laysong2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VideoView.video_url="https://www.youtube.com/embed/8iIHDRT4qN8";
                Intent mintent=new Intent(MainActivity.this,VideoView.class);
                startActivity(mintent);
            }
        });

        layson3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VideoView.video_url="https://www.youtube.com/embed/_pZTxQ4WNTI";
                Intent mintent=new Intent(MainActivity.this,VideoView.class);
                startActivity(mintent);
            }
        });

        laysong4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                VideoView.video_url="https://www.youtube.com/embed/gh4xZgi4mI0";
                Intent mintent=new Intent(MainActivity.this,VideoView.class);
                startActivity(mintent);
            }
        });



    }
}