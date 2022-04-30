package com.example.javademoapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class subMainActivity8 extends AppCompatActivity implements View.OnClickListener {

    private Button bigBtn;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain8);
        Button button = findViewById(R.id.btn);
        bigBtn = findViewById(R.id.BigButton);
        Button enableBtn = findViewById(R.id.enableButton);
        Button disableBtn = findViewById(R.id.disableButton);
        textView = findViewById(R.id.textResult);
        button.setText("点击这里");
        enableBtn.setText("启用大按钮");
        disableBtn.setText("禁用大按钮");
        bigBtn.setText("大按钮");
        textView.setText("测试结果");
        enableBtn.setOnClickListener(this);
        disableBtn.setOnClickListener(this);
        bigBtn.setOnClickListener(this);


        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(subMainActivity8.this, subMainActivity8.class);
            startActivity(intent);
        });


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.enableButton:
                bigBtn.setEnabled(true);
                bigBtn.setBackgroundColor(0xff6200ee);
                textView.setText("大按钮启用了");
                break;

            case R.id.disableButton:
                bigBtn.setEnabled(false);
                bigBtn.setBackgroundColor(0xff4b4d4d);
                textView.setText("大按钮禁用了");
                break;

            case R.id.BigButton:
                textView.setText("大按钮点击了");
                break;
        }
    }
}