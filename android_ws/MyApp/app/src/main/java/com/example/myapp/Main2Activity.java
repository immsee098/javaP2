package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onButton1Clicked(View view) {
        Intent intent=new Intent(getApplicationContext(), Linear2Activity.class);
        startActivity(intent);
    }


    public void onButton2Clicked(View view) {
        Intent intent=new Intent(getApplicationContext(), RelActivity.class);
        startActivity(intent);
    }


    public void onButton3Clicked(View view) {
        Intent intent=new Intent(getApplicationContext(), ScrollActivity.class);
        startActivity(intent);
    }

    public void onButton4Clicked(View view) {
        Intent intent=new Intent(getApplicationContext(), FrameActivity.class);
        startActivity(intent);
    }
}
