package com.badorek.coursework;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Storage storage = Storage.getInstance();

        storage.addUser(new User("teme"));



        Button secondActivityBtn = (Button)findViewById(R.id.listActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(startIntent);

            }
        });

        Button googleBtn =(Button) findViewById(R.id.GoogleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String google = "https://www.google.fi/?hl=fi";
                Uri webaddress = Uri.parse(google);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (goToGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(goToGoogle);
                }else {System.out.println("no google");
                }
            }
        });



    }
}