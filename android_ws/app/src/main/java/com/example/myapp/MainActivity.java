package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bt5 = findViewById(R.id.button5);
        bt5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), LinearActivity.class);
                startActivity(intent);
            }
        });


    }

    public void onButton1Clicked(View view) {
        Toast.makeText(getApplicationContext(),"버튼 클릭됨" , Toast.LENGTH_SHORT).show();

    }

    public void onButton2Clicked(View view) {
        //네이버 접속하기
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }

    public void onButton3Clicked(View view) {
        //전화걸기
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-1000-2000"));
        startActivity(intent);
    }





    public void onButton4Clicked(View view) {
        Intent intent=new Intent(getApplicationContext(), NewActivity.class);
        startActivity(intent);
    }


    public void onButton6Clicked(View view) {
        setContentView(R.layout.table_layout2);

        Button btOk=findViewById(R.id.ok);
        btOk.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"예 버튼 클릭됨!", Toast.LENGTH_SHORT).show();
            }
        });
    }


    public void onButton7Clicked(View view) {
        setContentView(R.layout.table_layout);
    }

    public void onButton8Clicked(View view) {
        Intent intent=new Intent(getApplicationContext(), CodeActivity.class);
        startActivity(intent);
    }





}






