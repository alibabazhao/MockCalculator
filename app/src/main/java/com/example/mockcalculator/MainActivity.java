package com.example.mockcalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView tv_number;

    private Button btn_zero;
    private Button btn_one;
    private Button btn_two;
    private Button btn_three;
    private Button btn_four;
    private Button btn_five;
    private Button btn_six;
    private Button btn_seven;
    private Button btn_eight;
    private Button btn_nine;

    private Button btn_add;
    private Button btn_subtract;
    private Button btn_multiply;
    private Button btn_divide;

    private Button btn_dot;
    private Button btn_equal;
    private Button btn_percent;
    private Button btn_sign;
    private Button btn_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_number=findViewById(R.id.tv_number);

        btn_zero=findViewById(R.id.btn_zero);
        btn_one=findViewById(R.id.btn_one);
        btn_two=findViewById(R.id.btn_two);
        btn_three=findViewById(R.id.btn_three);
        btn_four=findViewById(R.id.btn_four);
        btn_five=findViewById(R.id.btn_five);
        btn_six=findViewById(R.id.btn_six);
        btn_seven=findViewById(R.id.btn_seven);
        btn_eight=findViewById(R.id.btn_eight);
        btn_nine=findViewById(R.id.btn_nine);
        btn_add=findViewById(R.id.btn_add);
        btn_subtract=findViewById(R.id.btn_subtract);
        btn_multiply=findViewById(R.id.btn_multiply);
        btn_divide=findViewById(R.id.btn_divide);
        btn_dot=findViewById(R.id.btn_dot);
        btn_equal=findViewById(R.id.btn_equal);
        btn_percent=findViewById(R.id.btn_percent);
        btn_sign=findViewById(R.id.btn_sign);
        btn_clear=findViewById(R.id.btn_clear);


    }
}

