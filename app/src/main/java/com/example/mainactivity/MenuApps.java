package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuApps extends AppCompatActivity {

    Button btLSegitiga, btLPersegi, btLLingkaran, btLTrapesium, btBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_apps);

        btLSegitiga=(Button) findViewById(R.id.buttonSegitiga);
        btLPersegi=(Button) findViewById(R.id.buttonPersegi);
        btLLingkaran=(Button) findViewById(R.id.buttonLingkaran);
        btLTrapesium=(Button) findViewById(R.id.buttonTrapesium);
        btBack=(Button) findViewById(R.id.buttonBack);

        Intent intent=getIntent();

        btLSegitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuApps.this, Segitiga.class);
                startActivity(intent);

            }
        });

        btLPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuApps.this, Persegi.class);
                startActivity(intent);

            }
        });

        btLLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuApps.this, Lingkaran.class);
                startActivity(intent);

            }
        });

        btLTrapesium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuApps.this, Trapesium.class);
                startActivity(intent);

            }
        });


        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MenuApps.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
}