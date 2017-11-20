package com.example.adity.physicsfun2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onClick1(View v) {
        startActivity(new Intent("com.example.adity.physicsfun2.OneActivity"));
    }
    public void onClick2(View v) {
        startActivity(new Intent("com.example.adity.physicsfun2.TwoActivity"));
    }
    public void onClick3(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.ThreeActivity"));
    }
    public void onClick4(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.FourActivity"));
    }
    public void onClick5(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.FiveActivity"));
    }
    public void onClick6(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.SixActivity"));
    }
    public void onClick7(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.SevenActivity"));
    }
    public void onClick8(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.EightActivity"));
    }
    public void onClick9(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.NineActivity"));
    }
    public void onClick10(View v) {
        Toast.makeText(getApplicationContext(), "Nice!", Toast.LENGTH_SHORT).show();
        startActivity(new Intent("com.example.adity.physicsfun2.TenActivity"));
    }
}
