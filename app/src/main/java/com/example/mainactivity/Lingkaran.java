package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Lingkaran extends AppCompatActivity {

    EditText etJari;
    TextView tvHasil;
    Button btBack, btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        btBack = (Button) findViewById(R.id.buttonBackLingkaran);
        btHitung = (Button) findViewById(R.id.buttonHitungLingkaran);

        etJari = (EditText) findViewById(R.id.editTextJarijariLingkaran);

        tvHasil = (TextView) findViewById(R.id.textViewHasilLingkaran);

        Intent intent = getIntent();

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Lingkaran.this, MenuApps.class);
                startActivity(intent);

            }
        });

        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etJari.length() == 0) {
                    Toast.makeText(getApplication(), "Jari-jari tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else {
                    String isiJari = etJari.getText().toString();
                    double jari = Double.parseDouble(isiJari);
                    double hasil = LuasLingkaran(jari);
                    String output = String.valueOf(hasil);
                    tvHasil.setText(output.toString());
                }
            }
        });
    }

    public double LuasLingkaran(double r) {
        return 3.14 * r * r;
    }
}