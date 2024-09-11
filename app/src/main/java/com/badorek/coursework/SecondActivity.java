package com.badorek.coursework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.badorek.coursework.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.SecondActivityTV);
            String text = getIntent().getExtras().getString("com.badorek.coursework.SOMETHING");
            tv.setText(text);
        }
    }
}