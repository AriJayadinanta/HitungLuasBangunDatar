package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segitiga extends AppCompatActivity {

    EditText etAlas, etTinggi;
    TextView tvHasil;
    Button btBack, btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        btBack = (Button) findViewById(R.id.buttonBackSegitiga);
        btHitung = (Button) findViewById(R.id.buttonHitungSegitiga);

        etAlas = (EditText) findViewById(R.id.editTextAlasSegitiga);
        etTinggi = (EditText) findViewById(R.id.editTextTinggiSegitiga);

        tvHasil = (TextView) findViewById(R.id.textViewHasilSegitiga);

        Intent intent = getIntent();

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Segitiga.this, MenuApps.class);
                startActivity(intent);

            }
        });


        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etAlas.length() == 0 && etTinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else if (etAlas.length() == 0) {
                    Toast.makeText(getApplication(), "Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                } else if (etTinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isialas = etAlas.getText().toString();
                    String isitinggi = etTinggi.getText().toString();
                    double alas = Double.parseDouble(isialas);
                    double tinggi = Double.parseDouble(isitinggi);
                    double hasil = LuasSegitiga(alas, tinggi);
                    String output = String.valueOf(hasil);
                    tvHasil.setText(output.toString());
                }
            }
        });
    }

    public double LuasSegitiga(double a, double t) {
        return a * t / 2;
    }
}


