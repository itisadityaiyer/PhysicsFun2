package com.example.adity.physicsfun2;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.VideoView;
import android.net.Uri;

public class ImpuritiesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.impurities);
    }

    public void onClick12(View v) {
        VideoView videoview = (VideoView) findViewById(R.id.videoView4);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.impurities);
        videoview.setVideoURI(uri);
        videoview.start();
    }
}