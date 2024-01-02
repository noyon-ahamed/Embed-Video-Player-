package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class VideoView extends AppCompatActivity {

    WebView mwebview;
    public static String video_url="";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_view);

        mwebview=findViewById(R.id.mwebview);

        mwebview.getSettings().setJavaScriptEnabled(true);
        mwebview.loadUrl(video_url);

    }
}