package com.example.cforcoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    Button hackerrank,w3schools,codechef,topcoder,codewars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);


        hackerrank=findViewById(R.id.link1);


        hackerrank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hackerrank.com/domains/c?filters%5Bstatus%5D%5B%5D=unsolved&badge_type=c")));
            }
        });


        w3schools=findViewById(R.id.link2);


        w3schools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.w3schools.com/cpp/default.asp")));
            }
        });

        codechef=findViewById(R.id.link3);


        codechef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.programiz.com/c-programming")));
            }
        });

        topcoder=findViewById(R.id.link4);


        topcoder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.javatpoint.com/c-programming-language-tutorial#:~:text=C%20language%20is%20a%20system,.Net%2C%20PHP%2C%20etc.")));
            }
        });

        codewars=findViewById(R.id.link5);


        codewars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.codewars.com/?language=c")));
            }
        });
    }
}