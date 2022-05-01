package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView screen;
    //first number
    private String firstNum = "";
    //operator
    private String operator = "";
    //second number
    private String secondNum = "";
    //result
    private String result = "";
    private String showResult = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = findViewById(R.id.screen);
        findViewById(R.id.btn_clean).setOnClickListener(this);
        findViewById(R.id.btn_plus).setOnClickListener(this);
        findViewById(R.id.btn_minus).setOnClickListener(this);
        findViewById(R.id.btn_device).setOnClickListener(this);
        findViewById(R.id.btn_cross).setOnClickListener(this);
        findViewById(R.id.btn_C).setOnClickListener(this);
        findViewById(R.id.btn_D).setOnClickListener(this);
        findViewById(R.id.btn_E).setOnClickListener(this);
        findViewById(R.id.btn_F).setOnClickListener(this);
        findViewById(R.id.btn_DEC).setOnClickListener(this);
        findViewById(R.id.btn_8).setOnClickListener(this);
        findViewById(R.id.btn_9).setOnClickListener(this);
        findViewById(R.id.btn_A).setOnClickListener(this);
        findViewById(R.id.btn_B).setOnClickListener(this);
        findViewById(R.id.btn_BIN).setOnClickListener(this);
        findViewById(R.id.btn_4).setOnClickListener(this);
        findViewById(R.id.btn_5).setOnClickListener(this);
        findViewById(R.id.btn_6).setOnClickListener(this);
        findViewById(R.id.btn_7).setOnClickListener(this);
        findViewById(R.id.btn_delete).setOnClickListener(this);
        findViewById(R.id.btn_0).setOnClickListener(this);
        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);
        findViewById(R.id.btn_equal).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String inputText;
        if (view.getId() == R.id.btn_DEC) {
            inputText = "DEC";
        } else if (view.getId() == R.id.btn_BIN) {
            inputText = "BIN";
        } else {
            inputText = ((TextView) view).getText().toString();
        }
        switch (view.getId()) {
            case R.id.btn_clean:
                clean();
                break;
            case R.id.btn_delete:
                break;

            case R.id.btn_plus:
            case R.id.btn_minus:
            case R.id.btn_cross:
            case R.id.btn_device:
                operator = inputText;
                refreshText(showResult + operator);
                break;
            case R.id.btn_equal:
                double calculate_result = calculateFour();
                break;

            case R.id.btn_DEC:
                break;
            case R.id.btn_BIN:
                break;
            default:
                if (operator.equals("")) {
                    firstNum = firstNum + inputText;
                } else {
                    secondNum = secondNum + inputText;
                }
                if (showResult.equals("0")) {
                    refreshText(inputText);
                } else {
                    refreshText(showResult + inputText);
                }
                break;
        }
    }

    private double calculateFour() {
        switch (operator) {
            case "+":
                ;
        }
        return 0;
    }

    private void clean() {
        refreshText("");
        refreshOperate("");
    }

    private void refreshOperate(String new_result) {
        result = new_result;
        firstNum = result;
        secondNum = "";
        operator = "";

    }

    private void refreshText(String text) {
        showResult = text;
        screen.setText(showResult);

    }
}