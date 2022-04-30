package com.example.javademoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javademoapp.Util.GetDateUtil;

public class subMainActivity7 extends AppCompatActivity {

    private TextView timeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submain7);
        Button nextButton = findViewById(R.id.btn);
        nextButton.setText("点击这里");
        nextButton.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setClass(subMainActivity7.this, subMainActivity8.class);
            startActivity(intent);
        });
        Button timeButton = findViewById(R.id.timeBtn);
        timeButton.setText("显示时间");
        timeButton.setOnClickListener(
        this::showTime);
        timeView = findViewById(R.id.result);

        Button longBtn = findViewById(R.id.longBtn);
        longBtn.setText("长按此处");
        longBtn.setOnLongClickListener(new MyLongClickListener(timeView));
        longBtn.setOnClickListener(view -> timeView.setText("长按试试"));

    }
    public void showTime(View view){
        String desc = String.format("%s点击了按钮%s", GetDateUtil.getNowTime(),((Button)view).getText());
        timeView.setText(desc);
    }
   static class MyLongClickListener implements View.OnLongClickListener {

       private final TextView timeView;

       public MyLongClickListener(TextView timeView) {
           this.timeView = timeView;
       }

       @Override
       public boolean onLongClick(View view) {
           String desc = String.format("%s长按了按钮", GetDateUtil.getNowTime());
           timeView.setText(desc);
           return false;
       }
   }
}