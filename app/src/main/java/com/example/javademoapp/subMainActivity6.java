package com.example.javademoapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class subMainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain6);
        Button button = findViewById(R.id.btn);
        button.setText("点击这里");
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(subMainActivity6.this, subMainActivity6.class);
            startActivity(intent);
        });
    }
}