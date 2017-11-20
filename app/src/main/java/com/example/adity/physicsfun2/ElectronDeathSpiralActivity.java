package com.example.adity.physicsfun2;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.VideoView;
import android.net.Uri;

public class ElectronDeathSpiralActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.electron_death_spiral);
    }

    public void onClick11(View v) {
        VideoView videoview = (VideoView) findViewById(R.id.videoView3);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.electrondeathspiral);
        videoview.setVideoURI(uri);
        videoview.start();
    }
}