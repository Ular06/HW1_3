package com.example.lesson1_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String getMag = intent.getStringExtra("message");
        String getMag2 = intent.getStringExtra("message2");
        String getMag3 = intent.getStringExtra("message3");

        TextView textView3 = (TextView) findViewById(R.id.edt_btn3);
        textView3.setText(getMag3);
        TextView textView2 = (TextView) findViewById(R.id.txt_lastTo);
        textView2.setText(getMag2);
        TextView textView = (TextView) findViewById(R.id.txt_lastFrom);
        textView.setText(getMag);

    }

    public void onClickBack(View view) {
        Intent intent2 = new Intent(this, MainActivity.class);
        startActivity(intent2);
    }
}





