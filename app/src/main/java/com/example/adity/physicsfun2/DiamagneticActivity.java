package com.example.adity.physicsfun2;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.widget.VideoView;
import android.net.Uri;

public class DiamagneticActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diamagnetic);
    }

    public void onClick13(View v) {
        VideoView videoview = (VideoView) findViewById(R.id.videoView5);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.diamagnetic);
        videoview.setVideoURI(uri);
        videoview.start();
    }
}