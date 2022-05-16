package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Trapesium extends AppCompatActivity {

    EditText etAtas, etBawah, etTinggi;
    TextView tvHasil;
    Button btBack, btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        btBack = (Button) findViewById(R.id.buttonBackTrapesium);
        btHitung = (Button) findViewById(R.id.buttonHitungTrapesium);

        etAtas = (EditText) findViewById(R.id.editTextSisiAtasTrapesium);
        etBawah = (EditText) findViewById(R.id.editTextSisiBawahTrapesium);
        etTinggi = (EditText) findViewById(R.id.editTextTinggiTrapesium);

        tvHasil = (TextView) findViewById(R.id.textViewHasilTrapesium);

        Intent intent = getIntent();

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trapesium.this, MenuApps.class);
                startActivity(intent);

            }
        });

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etAtas.length() == 0 && etBawah.length() == 0 && etTinggi.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi Atas dan Bawah tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else if (etAtas.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi Atas tidak boleh kososng", Toast.LENGTH_LONG).show();
                } else if (etBawah.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi Bawah tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else  if (etTinggi.length() == 0){
                    Toast.makeText(getApplication(), "Tinggi tidak boleh kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isiAtas = etAtas.getText().toString();
                    String isiBawah = etBawah.getText().toString();
                    String isiTinggi = etTinggi.getText().toString();
                    double atas = Double.parseDouble(isiAtas);
                    double bawah = Double.parseDouble(isiBawah);
                    double tinggi = Double.parseDouble(isiTinggi);
                    double hasil = LuasTrapesium(atas, bawah, tinggi);
                    String output = String.valueOf(hasil);
                    tvHasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasTrapesium(double a, double b, double t) {
        return 0.5 * (a * b) * t;
    }
}