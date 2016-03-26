package com.example.vee.git;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tvResult;
    EditText edtNumber1;
    EditText edtNumber2;
    Button btnMultiple;
    Button btnPlus;
    Button btnSub;
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialViews();
    }

    private void initialViews() {
        tvResult = (TextView) findViewById(R.id.tvResult);
        edtNumber1 = (EditText) findViewById(R.id.edtNumber1);
        edtNumber2 = (EditText) findViewById(R.id.edtNumber2);
        btnMultiple = (Button) findViewById(R.id.btnMul);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnPlus = (Button) findViewById(R.id.btnPlus);

        setupViews();
    }

    private void setupViews() {
        View.OnClickListener multipleListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(edtNumber1.getText().toString());
                int number2 = Integer.parseInt(edtNumber2.getText().toString());

                result = number1 * number2;
                tvResult.setText("" + result);
            }
        };

        btnMultiple.setOnClickListener(multipleListener);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(edtNumber1.getText().toString()) + Integer.parseInt(edtNumber2.getText().toString());
                tvResult.setText(String.valueOf(result));
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(edtNumber1.getText().toString());
                int num2 = Integer.parseInt(edtNumber2.getText().toString());

                result = num1 - num2;
                tvResult.setText(result);
            }
        });
    }
}
