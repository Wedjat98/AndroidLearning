package com.example.javademoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class subMainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain9);
        Button button = findViewById(R.id.btn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(subMainActivity9.this, subMainActivity9.class);
            startActivity(intent);
        });
    }
}