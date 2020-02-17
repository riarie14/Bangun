package com.example.pert22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainKerucut extends AppCompatActivity {


    private EditText etJAlas,etTKerucut;
    private Button btnHasil;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_kerucut);


        tvHasil = findViewById(R.id.tvHasil);
        btnHasil = findViewById(R.id.btnHasil);
        etJAlas = findViewById(R.id.etJAlas);
        etTKerucut = findViewById(R.id.etTKerucut);


        btnHasil.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                try {

                    String sJAlas = etJAlas.getText().toString();
                    String sTKerucut = etTKerucut.getText().toString();


                    double dJAlas = Double.parseDouble(sJAlas);
                    double dTKerucut = Double.parseDouble(sTKerucut);


                    double hitung = ((dJAlas*dJAlas)+(dTKerucut*dTKerucut))*3.14*dJAlas;

                    String sHasil = String.valueOf(hitung);
                    tvHasil.setText(sHasil);


                }catch(NumberFormatException nfe){
                    Toast.makeText(getApplicationContext(),"Tidak boleh ada yang kosong", Toast.LENGTH_SHORT).show();

                }
            }
        });


    }
}
