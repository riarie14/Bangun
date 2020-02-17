package com.example.pert22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainLimas extends AppCompatActivity {

    private EditText etAS,etTS,etTLimas;
    private Button btnHasil;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_limas);


        tvHasil = findViewById(R.id.tvHasil);
        btnHasil = findViewById(R.id.btnHasil);
        etAS = findViewById(R.id.etAS);
        etTS = findViewById(R.id.etTS);
        etTLimas = findViewById(R.id.etTLimas);

        btnHasil.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    String sAS = etAS.getText().toString();
                    String sTS = etTS.getText().toString();
                    String sTLimas = etTLimas.getText().toString();

                    double dAS = Double.parseDouble(sAS);
                    double dTS = Double.parseDouble(sTS);
                    double dTLimas = Double.parseDouble(sTLimas);

                    double hitung = (((dAS*dTS)/2)*dTLimas)/3;

                    String sHasil = String.valueOf(hitung);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
