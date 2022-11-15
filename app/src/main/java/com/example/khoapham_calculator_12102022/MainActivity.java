package com.example.khoapham_calculator_12102022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNumber1, edtNumber2;
    TextView txtResults;
    Button btnPlus, btnMinus, btnMultiplication, btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumber1 = findViewById(R.id.edit_text_number1);
        edtNumber2 =findViewById(R.id.edit_text_number2);
        txtResults =findViewById(R.id.text_view_results);
        btnPlus =findViewById(R.id.button_plus);
        btnMinus =findViewById(R.id.button_minus);
        btnMultiplication=findViewById(R.id.button_multiplication);
        btnDivision=findViewById(R.id.button_division);
    }
}