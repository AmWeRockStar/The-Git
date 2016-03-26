package com.example.vee.git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Scene;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtNumber1, edtNumber2;
        TextView tvResult;
        Button btnPlus;
        int result;

        edtNumber1 = (EditText)findViewById(R.id.edtNumber1);
        edtNumber2 = (EditText)findViewById(R.id.edtNumber2);
        tvResult = (TextView)findViewById(R.id.tvResult);
        btnPlus = (Button) findViewById(R.id.btnPlus);

//        View.OnClickListener()

    }
}
