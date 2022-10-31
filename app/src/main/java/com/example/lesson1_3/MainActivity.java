package com.example.lesson1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText editText1;
    public EditText editText2;
    public EditText editText3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.edt_btn1);
        editText2 = (EditText) findViewById(R.id.edt_btn2);
        editText3 = (EditText) findViewById(R.id.edt_btn3);


    }

    public void onClickNext(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String getMessage = editText1.getText().toString();
        String getMessage2 = editText2.getText().toString();
        String getMessage3 = editText3.getText().toString();

        intent.putExtra("message", getMessage);
        intent.putExtra("message2", getMessage2);
        intent.putExtra("message3", getMessage3);

        startActivity(intent);

    }
}