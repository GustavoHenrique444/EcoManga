package com.example.ecomanga;

import  androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    public final static String login = "com.example.EcoManga.MESSAGE";
    EditText email, senha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        email = (EditText) findViewById(R.id.email);
        senha = (EditText) findViewById(R.id.senha);
    }

    public void LogandoUsuario(View view) {
        if (email.getText().toString().matches("") || senha.getText().toString().matches("")) {
            Toast.makeText(this, "Por favor, forneça seu email e senha para fazer login. ", Toast.LENGTH_SHORT).show();
        } else {
            Intent home = new Intent(this, MainActivity.class);
            EditText nome = (EditText)findViewById(R.id.email);
            String msg = nome.getText().toString();
            home.putExtra(login, msg);
            startActivity(home);
        }
    }
}