package com.example.ecomanga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void site (View v){
        Uri n = Uri.parse("http://www.cleanipedia.com/br/sustentabilidade/como-reciclar-papel.html");
        Intent reciclagem = new Intent(Intent.ACTION_VIEW, n);
        startActivity(reciclagem);
    }

    public void organic (View v){
        Uri n = Uri.parse("http://www.ecycle.com.br/lixo-organico/");
        Intent organic = new Intent(Intent.ACTION_VIEW, n);
        startActivity(organic);
    }

    public void metal (View v){
        Uri n = Uri.parse("http://portais.univasf.edu.br/sustentabilidade/noticias-sustentaveis/qual-e-o-processo-de-reciclagem-do-metal");
        Intent metal = new Intent(Intent.ACTION_VIEW, n);
        startActivity(metal);
    }

}



