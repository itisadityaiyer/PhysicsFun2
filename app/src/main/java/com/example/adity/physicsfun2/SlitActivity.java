package com.example.adity.physicsfun2;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.VideoView;
import android.net.Uri;

public class SlitActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slit);
    }

    public void onClick14(View v) {
        VideoView videoview = (VideoView) findViewById(R.id.videoView6);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.slit);
        videoview.setVideoURI(uri);
        videoview.start();
    }
}