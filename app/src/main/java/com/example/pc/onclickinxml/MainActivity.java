package com.example.pc.onclickinxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private EditText txt1, txt2;
    private TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnResult(View view) {
        txt1 =  findViewById(R.id.number1); //get ID of EditText
        txt2 =  findViewById(R.id.number2); // get ID of EditText
        //if txt1 && txt2 not empty , execute
        if(!txt1.getText().toString().isEmpty()&&!txt2.getText().toString().isEmpty()){
            textview = findViewById(R.id.txt);
            int result = Integer.parseInt(txt1.getText().toString()) + Integer.parseInt(txt2.getText().toString());
            textview.setText(result + "");
        }
    }
}
