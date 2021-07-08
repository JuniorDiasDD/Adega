package com.example.adega;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class login extends AppCompatActivity {
Button entrar,regist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        regist=findViewById(R.id.registar);
        entrar=findViewById(R.id.button);

        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          Intent caminho=new Intent(login.this,Home.class);
          login.this.startActivity(caminho);
            }
        });

        regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caminho=new Intent(login.this, registar.class);
                login.this.startActivity(caminho);
            }
        });

    }
}