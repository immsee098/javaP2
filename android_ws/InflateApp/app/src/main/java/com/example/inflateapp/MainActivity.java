package com.example.inflateapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static  final int REQUEST_CODE_ANOTHER=1001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButton1Clicked(View view) {
        inflateLayout();
    }

    private void inflateLayout() {
        LinearLayout linearLayout = findViewById(R.id.contentsLayout);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.button, linearLayout, true);
        //=> button.xml 에 정의된 레이아웃에 대한 인플레이션 수행
        //=> contentsLayout 을 부모 컨테이너로 하여 button.xml 파일에 정의된 레이아웃을 추가하라

        Button selectBt =findViewById(R.id.selectButton);
        final CheckBox ckAllDay =findViewById(R.id.allDay);

        selectBt.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(ckAllDay.isChecked()){
                    ckAllDay.setChecked(false);
                }else{
                    ckAllDay.setChecked(true);
                }
            }
        });

    }

    public void onButtonClicked(View view) {
        Intent intent=new Intent(getBaseContext(), AnotherActivity.class);
        startActivityForResult(intent, REQUEST_CODE_ANOTHER);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode ==REQUEST_CODE_ANOTHER){
            Toast.makeText(getApplicationContext(), "응답보낸 액티비티 requestCode="+requestCode
                    +", resultCode=" +resultCode, Toast.LENGTH_SHORT ).show();

            if(resultCode==RESULT_OK){
                String userName=data.getExtras().getString("userName");


                Toast.makeText(getApplicationContext(), "응답 데이터, userName=" + userName,
                        Toast.LENGTH_SHORT).show();
            }
        }


    }
}







