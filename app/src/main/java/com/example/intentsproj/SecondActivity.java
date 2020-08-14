package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText txt1;
    EditText txt2;
    TextView re;
    String s1,s2;
    Button bplus,bmin,bmulty,bdiv;
    float res;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1  = findViewById(R.id.field1);
        txt2  = findViewById(R.id.field2);
        re = findViewById(R.id.field3);
        bplus  = findViewById(R.id.btnplus);
        bmin  = findViewById(R.id.btnmin);
        bmulty  = findViewById(R.id.btnmulty);
        bdiv  = findViewById(R.id.btndiv);


        s1 = getIntent().getExtras().getString("Value1");
        txt1.setText(s1);
        s2 = getIntent().getExtras().getString("Value2");
        txt2.setText(s2);

        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(txt1.getText().toString());
                num2 = Integer.parseInt((txt2.getText().toString()));

                res = num1 + num2;

                re.setText(txt1.getText().toString() + " + " + txt2.getText().toString() + " = " +String.valueOf(res));

            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(txt1.getText().toString());
                num2 = Integer.parseInt((txt2.getText().toString()));

                res = num1 - num2;

                re.setText(txt1.getText().toString() + " - " + txt2.getText().toString() + " = " +String.valueOf(res));

            }
        });

        bmulty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(txt1.getText().toString());
                num2 = Integer.parseInt((txt2.getText().toString()));

                res = num1 * num2;

                re.setText(txt1.getText().toString() + " * " + txt2.getText().toString() + " = " +String.valueOf(res));

            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                num1 = Integer.parseInt(txt1.getText().toString());
                num2 = Integer.parseInt((txt2.getText().toString()));

                res = num1 / num2;

                re.setText(txt1.getText().toString() + " / " + txt2.getText().toString() + " = " +String.valueOf(res));

            }
        });
    }
}