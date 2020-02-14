package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FrameActivity extends AppCompatActivity {
    ImageView imageView01;
    ImageView imageView02;
    boolean imageFlag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        imageView01=findViewById(R.id.imageView01);
        imageView02=findViewById(R.id.imageView02);
    }

    public void onButton1Clicked(View view) {
        if(!imageFlag){
            imageView01.setVisibility(View.VISIBLE);
            imageView02.setVisibility(View.INVISIBLE);
        }else{
            imageView01.setVisibility(View.INVISIBLE);
            imageView02.setVisibility(View.VISIBLE);
        }
        imageFlag=!imageFlag;
    }

}
