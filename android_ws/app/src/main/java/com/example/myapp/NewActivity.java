package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }

    public void onBtBackClicked(View view) {
        Toast.makeText(getApplicationContext(),"이전화면으로 돌아감", Toast.LENGTH_SHORT).show();
        finish();
    }
}
