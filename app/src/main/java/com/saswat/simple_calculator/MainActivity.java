package com.saswat.simple_calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(View View) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber1);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        RadioButton radioButton = findViewById(R.id.radioButton);
        RadioButton radioButton2 = findViewById(R.id.radioButton2);
        RadioButton radioButton3 = findViewById(R.id.radioButton3);

        int result=0;

        if(radioButton.isChecked()){
            result = n1+n2;
        } else if(radioButton2.isChecked()){
            result = n1-n2;
        }else if(radioButton3.isChecked()){
            result = n1*n2;
        }
        TextView textView = findViewById(R.id.textView);
        textView.setText("Result:"+result);
    }
}
