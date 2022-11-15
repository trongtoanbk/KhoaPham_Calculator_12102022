package com.example.khoapham_calculator_12102022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtNumber1, edtNumber2;
    TextView txtResults;
    Button btnPlus, btnMinus, btnMultiplication, btnDivision;
    float number1, number2;

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



        // get data from edit text
        String textNumber1 =edtNumber1.getText().toString();


        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 =edtNumber1.getText().toString();
                String textNumber2 =edtNumber2.getText().toString();
                if (textNumber1.isEmpty()||textNumber2.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập đủ tham số",Toast.LENGTH_SHORT).show();
                    return;
                }
                number1 =Float.parseFloat(textNumber1);
                number2 = Float.parseFloat(textNumber2);
                Float ketqua =number1+number2;
                String txtKetQua=ketqua + "";
                txtResults.setText("Kết quả a +b = " +txtKetQua);
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 =edtNumber1.getText().toString();
                String textNumber2 =edtNumber2.getText().toString();
                if (textNumber1.isEmpty()||textNumber2.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập đủ tham số",Toast.LENGTH_SHORT).show();
                    return;
                }
                number1 =Float.parseFloat(textNumber1);
                number2 = Float.parseFloat(textNumber2);
                Float ketqua =number1-number2;
                String txtKetQua=ketqua + "";
                txtResults.setText("Results " + number1 +"-" +number2 + "= " +txtKetQua);
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 =edtNumber1.getText().toString();
                String textNumber2 =edtNumber2.getText().toString();
                if (textNumber1.isEmpty()||textNumber2.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập đủ tham số",Toast.LENGTH_SHORT).show();
                    return;
                }
                number1 =Float.parseFloat(textNumber1);
                number2 = Float.parseFloat(textNumber2);
                Float ketqua =number1*number2;
                String txtKetQua=ketqua + "";
                txtResults.setText("Kết quả a *b = " +txtKetQua);
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textNumber1 =edtNumber1.getText().toString();
                String textNumber2 =edtNumber2.getText().toString();
                if (textNumber1.isEmpty()||textNumber2.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Bạn chưa nhập đủ tham số",Toast.LENGTH_SHORT).show();
                    return;
                }
                number1 =Float.parseFloat(textNumber1);
                number2 = Float.parseFloat(textNumber2);
                if (number2 ==0)
                {
                    Toast.makeText(MainActivity.this," không được để b bằng 0",Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    Float ketqua = number1 / number2;
                    String txtKetQua = ketqua + "";
                    txtResults.setText("Kết quả a : b = " + txtKetQua);
                }
            }
        });
    }
}