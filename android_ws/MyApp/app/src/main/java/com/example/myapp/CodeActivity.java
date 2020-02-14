package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

public class CodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams layoutParams
                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        Button bt1 = new Button(this);
        bt1.setText("확인");
        bt1.setLayoutParams(layoutParams);
        linearLayout.addView(bt1);

        Button bt2 = new Button(this);
        bt2.setText("취소");
        bt2.setLayoutParams(layoutParams);
        linearLayout.addView(bt2);

        setContentView(linearLayout);

    }
}
