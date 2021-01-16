package com.example.cforcoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity2 extends AppCompatActivity {

    Button geekforgeek,links,dbook;
    ImageButton code_editor;
    ImageButton ytlink;
    ImageButton Books;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        geekforgeek=findViewById(R.id.gfg);


        geekforgeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.geeksforgeeks.org/c-programming-language/")));
            }
        });

        code_editor=findViewById(R.id.codeeditor);

        code_editor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.onlinegdb.com/online_c_compiler")));
            }
        });

        dbook=findViewById(R.id.bd);

        dbook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.pdfdrive.com/let-us-c-by-yashwant-e200713283.html")));
            }
        });

        ytlink = findViewById(R.id.ytlinks);
        ytlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
            }
        });


        Books = findViewById(R.id.book);
        Books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(intent);
            }
        });

        links = (Button) findViewById(R.id.link);

        links.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(intent);
            }
        });

    }
}