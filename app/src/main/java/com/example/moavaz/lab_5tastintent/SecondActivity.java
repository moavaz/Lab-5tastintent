package com.example.moavaz.lab_5tastintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("edt text"));

      //  String msg = intent.getStringExtra("edt text");

        Toast.makeText(getApplicationContext(), "welcome", Toast.LENGTH_SHORT).show();
    }
}
