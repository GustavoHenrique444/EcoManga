package com.example.ecomanga;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    ImageButton manga_jojo;
    ImageButton manga_one;
    ImageButton manga_man;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton btnsair = findViewById(R.id.btnsair);
        btnsair.setOnClickListener(v -> finish());

        manga_man = findViewById(R.id.manga_man);
        manga_jojo = findViewById(R.id.manga_jojo);
        manga_one = findViewById(R.id.manga_one);
    }
    public void metodoAleatorioone(View view){
        Intent intent = new Intent(this, onepiece.class);
        startActivity(intent);
    }

    public void metodoAleatorioman(View view){
        Intent intent = new Intent(this, chainsawman.class);
        startActivity(intent);
    }

    public void metodoAleatoriojojo(View view){
        Intent intent = new Intent(this, jojobli.class);
        startActivity(intent);
    }

}

