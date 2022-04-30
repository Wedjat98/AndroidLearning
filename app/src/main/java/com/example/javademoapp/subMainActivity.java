package com.example.javademoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class subMainActivity extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain);
        TextView textView = findViewById(R.id.subText);
        TextView textView2 = findViewById(R.id.subText2);
        TextView textBC = findViewById(R.id.subTextBackgroundColor);
        textView.setText("你好，世界！");
        textView2.setText("第二界面");
        textBC.setText("带背景色");
//        textBC.setBackgroundColor(Color.GRAY);default Gray
        textBC.setBackgroundResource(R.color.teal_200);//resource colors.xml colors
        textView.setTextColor(0xff3ddc84);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(subMainActivity.this,subMainActivity2.class);
            startActivity(intent);
        });
    }
}
