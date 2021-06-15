package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub,
            buttonMul, buttonDivision, buttonEqual, buttonDot, buttonDel,buttonDelSingle;
    EditText e1,e2;
    TextView t1;

    final double[] input1 = {0};
    final double[] input2 = { 0 };


    public void getIn(){
        input1[0] = Double.parseDouble(e1.getText().toString());
        input2[0] = Double.parseDouble(e2.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final boolean[] Addition = new boolean[1];
        final boolean[] Subtract = new boolean[1];
        final boolean[] Division = new boolean[1];
        final boolean[] Multiplication = new boolean[1];
        final boolean[] decimal = new boolean[1];

        double[] ans = new double[1];

        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        t1 = (TextView) findViewById(R.id.t1);
        button0 = (Button) findViewById(R.id.b0);
        button1 = (Button) findViewById(R.id.b1);
        button2 = (Button) findViewById(R.id.b2);
        button3 = (Button) findViewById(R.id.b3);
        button4 = (Button) findViewById(R.id.b4);
        button5 = (Button) findViewById(R.id.b5);
        button6 = (Button) findViewById(R.id.b6);
        button7 = (Button) findViewById(R.id.b7);
        button8 = (Button) findViewById(R.id.b8);
        button9 = (Button) findViewById(R.id.b9);
        buttonDot = (Button) findViewById(R.id.bDot);
        buttonAdd = (Button) findViewById(R.id.opAdd);
        buttonSub = (Button) findViewById(R.id.opSub);
        buttonMul = (Button) findViewById(R.id.opMul);
        buttonDivision = (Button) findViewById(R.id.opDiv);
        buttonEqual = (Button) findViewById(R.id.opEql);
        buttonDel = (Button) findViewById(R.id.opClr);
        buttonDelSingle = (Button) findViewById(R.id.opClrSingle);
        Context context = getApplicationContext();
        CharSequence text = "Focus on the text box";
        int duration = Toast.LENGTH_SHORT;


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "1");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "1");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(e1.hasFocus())
                    e1.setText(e1.getText() + "2");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "2");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "3");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "3");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "4");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "4");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "5");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "5");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "6");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "6");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "7");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "7");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "8");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "8");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "9");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "9");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + "0");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + "0");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus())
                    e1.setText(e1.getText() + ".");
                else if(e2.hasFocus())
                    e2.setText(e2.getText() + ".");
                else
                    Toast.makeText(context, text, duration).show();
            }
        });



        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((e1.getText().length() != 0) && (e2.getText().length() != 0)) {
                    getIn();
                    ans[0] = input1[0] + input2[0];
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((e1.getText().length() != 0) && (e2.getText().length() != 0)) {
                    getIn();
                    ans[0] = input1[0] - input2[0];
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((e1.getText().length() != 0) && (e2.getText().length() != 0)) {
                    getIn();
                    ans[0] = input1[0] * input2[0];
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((e1.getText().length() != 0) && (e2.getText().length() != 0)) {
                    getIn();
                    if (input2[0] != 0){
                        ans[0] = input1[0] / input2[0];
                    }
                    else{
                        Toast.makeText(context, "Division by zero not allowed", duration).show();
                    }
                }
            }
        });


        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ans1 = String.valueOf(ans[0]);
                t1.setText(ans1);
                ans[0]= 0;
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
                input1[0] = 0.0;
                input2[0] = 0.0;
            }
        });

        buttonDelSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.hasFocus()){
                    e1.setText(e1.getText().toString().substring(0,(e1.getText().toString().length()-1)));
                }
                else if(e2.hasFocus()){
                    e2.setText(e2.getText().toString().substring(1,e2.getText().toString().length()));
                }
                else{
                    Toast.makeText(context, "Focus on either text fields", duration).show();
                }
                t1.setText("");
                input1[0] = 0.0;
                input2[0] = 0.0;
            }
        });

    }

}