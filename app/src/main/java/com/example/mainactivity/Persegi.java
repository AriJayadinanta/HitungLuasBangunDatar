package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {

    EditText etSisi;
    TextView tvHasil;
    Button btBack, btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        btBack = (Button) findViewById(R.id.buttonBackPersegi);
        btHitung = (Button) findViewById(R.id.buttonHitungPersegi);

        etSisi = (EditText) findViewById(R.id.editTextSisiPersegi);

        tvHasil = (TextView) findViewById(R.id.textViewHasilPersegi);

        Intent intent = getIntent();

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Persegi.this, MenuApps.class);
                startActivity(intent);

            }
        });


        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etSisi.length() == 0) {
                    Toast.makeText(getApplication(), "Sisi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isiSisi = etSisi.getText().toString();
                    double sisi = Double.parseDouble(isiSisi);
                    double hasil = LuasPersegi(sisi);
                    String output = String.valueOf(hasil);
                    tvHasil.setText(output.toString());
                }
            }
        });
    }

    public double LuasPersegi(double s) {
        return s*s;
    }
}