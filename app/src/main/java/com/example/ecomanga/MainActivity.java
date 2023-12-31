package com.example.ecomanga;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btninfo = findViewById(R.id.btninfo);
        btninfo.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });

        Button btnmanga = findViewById(R.id.btnmanga);
        btnmanga.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity3.class);
            startActivity(intent);
        });

        Button btnreci = findViewById(R.id.btnreci);
        btnreci.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity5.class);
            startActivity(intent);
        });

        Button btnmateri = findViewById(R.id.btnmateri);
        btnmateri.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, MainActivity6.class);
            startActivity(intent);
        });
    }




}