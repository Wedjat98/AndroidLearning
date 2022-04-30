package com.example.javademoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class subMainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_main3);
        Button button = findViewById(R.id.btn);
        button.setText("四");
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(subMainActivity3.this,subMainActivity3.class);
            startActivity(intent);
        });
    }
}