package com.example.vee.git;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtNumber1, edtNumber2;
    Button btnPlus;
    TextView tvResult;
    float Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNumber1 = (EditText) findViewById(R.id.edtNumber1);
        edtNumber2 = (EditText) findViewById(R.id.edtNumber2);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        tvResult = (TextView) findViewById(R.id.tvResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result = Float.parseFloat(edtNumber1.getText().toString()) + Float.parseFloat(edtNumber2.getText().toString());
                tvResult.setText(String.valueOf(Result));
            }
        });


    }
}
