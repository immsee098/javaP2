package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;

public class ScrollActivity extends AppCompatActivity {
    ScrollView scrollView;
    ImageView imageView;
    BitmapDrawable bitmapDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);

        scrollView=findViewById(R.id.scrollView01);
        imageView=findViewById(R.id.imageView01);

        // 가로 스크롤뷰의 메소드 호출
        scrollView.setHorizontalScrollBarEnabled(true);

        Resources resources =getResources();
        // drawable 리소스에 있는 이미지를 가져와서 이미지뷰에 설정하기
        bitmapDrawable  = (BitmapDrawable) resources.getDrawable(R.drawable.image01);
        int width=bitmapDrawable.getIntrinsicWidth();
        int height=bitmapDrawable.getIntrinsicHeight();

        imageView.setImageDrawable(bitmapDrawable);
        imageView.getLayoutParams().width=width;
        imageView.getLayoutParams().height=height;
/*
        setImageDrawable() – 이미지 뷰에 원본 이미지를 설정하면 이미지뷰가 화면의 크기에 맞추어
        자동으로 이미지의 크기를 조절함
        따라서 원본 이미지의 크기대로 이미지뷰에 보이도록 설정해야 스크롤뷰 안에서
        스크롤을 이용해 원본 이미지를 볼 수 있다.
*/
        Button button01=findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeImage();
            }
        });

    }

    private void changeImage() {
        Resources resources =getResources();
        // drawable 리소스에 있는 이미지를 가져와서
        // 이미지뷰에 설정하기
        bitmapDrawable  = (BitmapDrawable) resources.getDrawable(R.drawable.image02);
        int width=bitmapDrawable.getIntrinsicWidth();
        int height=bitmapDrawable.getIntrinsicHeight();

        imageView.setImageDrawable(bitmapDrawable);
        imageView.getLayoutParams().width=width;
        imageView.getLayoutParams().height=height;
    }


}
