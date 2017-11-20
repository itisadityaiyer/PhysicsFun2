package com.example.adity.physicsfun2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);
    }
    public void onClick(View v) {
        Toast.makeText(getApplicationContext(), "Uh-oh, that's wrong! Try again!", Toast.LENGTH_SHORT).show();
    }
    public void onClick2(View v) {
        Toast.makeText(getApplicationContext(), "Uh-oh, that's wrong! Try again!", Toast.LENGTH_SHORT).show();
    }
    public void onClick3(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.SlitActivity"));
    }
}
