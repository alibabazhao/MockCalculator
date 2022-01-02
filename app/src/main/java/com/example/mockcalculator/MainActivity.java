package com.example.mockcalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final int DIGITS = 9;

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

    //to save number value
    private String current_input;
    private String calculated_value;
    private String previous_input;
    private int digit; //save the total digits
    private char sign;
    private boolean is_input_decimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link the layout
        tv_number = findViewById(R.id.tv_number);

        btn_zero = findViewById(R.id.btn_zero);
        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);
        btn_five = findViewById(R.id.btn_five);
        btn_six = findViewById(R.id.btn_six);
        btn_seven = findViewById(R.id.btn_seven);
        btn_eight = findViewById(R.id.btn_eight);
        btn_nine = findViewById(R.id.btn_nine);
        btn_add = findViewById(R.id.btn_add);
        btn_subtract = findViewById(R.id.btn_subtract);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_divide = findViewById(R.id.btn_divide);
        btn_dot = findViewById(R.id.btn_dot);
        btn_equal = findViewById(R.id.btn_equal);
        btn_percent = findViewById(R.id.btn_percent);
        btn_sign = findViewById(R.id.btn_sign);
        btn_clear = findViewById(R.id.btn_clear);

        //set initial value
        setInitialValue();

        //add click listener for all the buttons
        btn_zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                if(current_input.equals("0") || current_input.equals("-0"))
                    return;

                //save the current digit
                current_input=current_input.concat("0");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("1");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("2");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("3");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("4");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("5");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("6");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("7");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("8");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");
                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                current_input=current_input.concat("9");
                digit++;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(btn_clear.getText().toString().equals("AC"))
                    btn_clear.setText("C");

                //check if already has dot
                if(is_input_decimal)
                    return;

                //check the total digits
                if (digit>=DIGITS)
                    return;

                //save the current digit
                if(digit==0){
                    current_input=current_input.concat("0.");
                    digit+=2;
                }
                else{
                    current_input=current_input.concat(".");
                    digit++;
                }

                is_input_decimal=true;

                //set the number in text view
                tv_number.setText(current_input);
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sign='+';

                if(calculated_value.equals("") && !current_input.equals("")){ //1+
                    previous_input=current_input;
                    calculated_value=current_input;

                    clearInput();
                    tv_number.setText(print(calculated_value)); //1
                }
                else if(!calculated_value.equals("") && !current_input.equals("")){ //1+1+ , 1+1+1+
                    previous_input=current_input;
                    //calculated_value+=current_input;
                    calculate(calculated_value, current_input);

                    clearInput();
                    tv_number.setText(print(calculated_value)); //2, 3
                }
                //else -> +, 1+, 1++ -> waiting for new input
            }
        });

        btn_subtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sign='-';

                if(calculated_value.equals("") && !current_input.equals("")){ //1-
                    previous_input=current_input;
                    calculated_value=current_input;

                    clearInput();
                    tv_number.setText(print(calculated_value)); //1
                }
                else if(!calculated_value.equals("") && !current_input.equals("")){ //1-1- , 1-1-1-
                    previous_input=current_input;
                    //calculated_value-=current_input;
                    calculate(calculated_value, current_input);

                    clearInput();
                    tv_number.setText(print(calculated_value)); //0, -1
                }
                else if(calculated_value.equals("") && current_input.equals("")){ //-
                    calculated_value="0";
                }
                //else -> 1-, 1-- -> waiting for new input
            }
        });

        btn_multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sign='*';

                if(calculated_value.equals("") && !current_input.equals("")){ //1*
                    previous_input=current_input;
                    calculated_value=current_input;

                    clearInput();
                    tv_number.setText(print(calculated_value)); //1
                }
                else if(!calculated_value.equals("") && !current_input.equals("")){ //1*2* , 1*2*3*
                    previous_input=current_input;
                    //calculated_value*=current_input;
                    calculate(calculated_value, current_input);

                    clearInput();
                    tv_number.setText(print(calculated_value)); //2, 6
                }
                else if(calculated_value.equals("") && current_input.equals("")){ //*
                    calculated_value="0";
                }
                //else -> 1*, 1** -> waiting for new input
            }
        });

        btn_divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sign='/';

                if(calculated_value.equals("") && !current_input.equals("")){ //1/
                    previous_input=current_input;
                    calculated_value=current_input;

                    clearInput();
                    tv_number.setText(print(calculated_value)); //1
                }
                else if(!calculated_value.equals("") && !current_input.equals("")){ //1/2/ , 1/2/2/
                    previous_input=current_input;
                    //calculated_value/=current_input;
                    calculate(calculated_value, current_input);

                    clearInput();
                    tv_number.setText(print(calculated_value)); //0.5, 0.25
                }
                else if(calculated_value.equals("") && current_input.equals("")){ // /
                    calculated_value="0";
                }
                //else -> 1/, 1// -> waiting for new input
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(sign=='/' && (current_input.equals("") || current_input.equals("0") || current_input.equals("-0"))){
                    tv_number.setText("Error");
                    setInitialValue();
                    return;
                }

                if(!calculated_value.equals("") && !current_input.equals("")) { //1+1=
                    previous_input=current_input;
                    //calculated_value+=current_input;
                    calculate(calculated_value, current_input);
                    //current_input="";
                    clearInput();
                    tv_number.setText(print(calculated_value));
                }
                else if(!calculated_value.equals("")){ //calculated_value!="" && current_input=="" -> 1+=
                    //calculated_value+=previous_input;
                    calculate(calculated_value, previous_input);
                    //current_input="";
                    clearInput();
                    tv_number.setText(print(calculated_value));
                }
                //else -> =, 1=, 1== -> waiting for new input
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //clear all to initial value
                setInitialValue();
                tv_number.setText("0");
                btn_clear.setText("AC");
            }
        });

        btn_sign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_input.equals("")){ //-
                    //calculated_value="0";
                    if(calculated_value.equals("")){
                        current_input=current_input.concat("-");
                        tv_number.setText("-0");
                    }
                    else if(calculated_value.charAt(0)=='-'){
                        calculated_value=calculated_value.substring(1);
                        tv_number.setText(print(calculated_value));
                    }
                    else{
                        calculated_value="-".concat(calculated_value);
                        tv_number.setText(print(calculated_value));
                    }

                }
                else if(current_input.charAt(0)=='-'){
                    current_input=current_input.substring(1);
                    tv_number.setText(current_input);
                }
                else{
                    current_input="-".concat(current_input);
                    tv_number.setText(current_input);
                }

            }
        });

        btn_percent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_input.equals("")){
                    current_input=tv_number.getText().toString();
                }
                //calculated_value=current_input/100;
                sign='/';
                calculate(current_input, "100");
                current_input=calculated_value;
                tv_number.setText(print(calculated_value));
            }
        });
    }
    private void setInitialValue(){
        current_input="";
        calculated_value="";
        previous_input="";

        digit = 0;
        sign = ' ';
        is_input_decimal=false;
    }
    private String print(String input){
        int left=input.indexOf('.');
        if(left==-1){
            return input;
        }
        String number=input.substring(0, left);

        int right=input.length()-1;
        while(left<right && input.charAt(right)=='0'){
            right--;
        }

        if(input.charAt(right)=='.')
            number+=input.substring(left, right);
        else
            number+=input.substring(left, right+1);

        return number;
    }
    private void clearInput(){
        current_input="";
        digit=0;
        is_input_decimal=false;
    }
    private void calculate(String num1, String num2){
        float x=Float.parseFloat(num1);
        float y=Float.parseFloat(num2);

        float answer=0;
        if(sign=='+'){
            answer=x+y;
        }
        else if(sign=='-'){
            answer=x-y;
        }
        else if(sign=='*'){
            answer=x*y;
        }
        else if(sign=='/'){
            answer=x/y;
        }

        System.out.println("x="+x+" y="+y+" "+" answer="+answer);

        calculated_value=Float.toString(answer);
    }
}