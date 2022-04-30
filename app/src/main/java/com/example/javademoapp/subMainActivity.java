package com.example.javademoapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class subMainActivity extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain);
        TextView textView = findViewById(R.id.subText);
        TextView textView2 = findViewById(R.id.subText2);
        textView.setText("@小猪猪拉屎真厉害！");
        textView2.setText("@小猪猪拉屎真厉害！");
        textView.setTextColor(0xff3ddc84);
    }
}
