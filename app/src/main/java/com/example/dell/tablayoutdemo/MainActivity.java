package com.example.dell.tablayoutdemo;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TabHost tabHost=getTabHost();
        //Tab for Photos
        TabSpec photospec=tabHost.newTabSpec("Photos");
        photospec.setIndicator("Photos");
        Intent photoIntent=new Intent(this,photo.class);
        photospec.setContent(photoIntent);
        //tab for videos
        TabSpec videospec=tabHost.newTabSpec("Videos");
        videospec.setIndicator("Videos");
        Intent videoIntent=new Intent(this,video.class);
        videospec.setContent(videoIntent);
        //tab for songs
        TabSpec songspec=tabHost.newTabSpec("Songs");
        songspec.setIndicator("Songs");
        Intent songsIntent=new Intent(this,songs.class);
        songspec.setContent(songsIntent);
        tabHost.addTab(photospec);
        tabHost.addTab(videospec);
        tabHost.addTab(songspec);
    }
}
