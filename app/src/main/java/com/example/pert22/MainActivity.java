package com.example.pert22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnLimas,btnKerucut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLimas = findViewById(R.id.btnLimas);
        btnKerucut = findViewById(R.id.btnKerucut);

        btnLimas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(MainActivity.this,MainLimas.class);
                startActivity(moveIntent);




            }
        }




        );

        btnKerucut.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            Intent moveIntent = new Intent(MainActivity.this,MainKerucut.class);
                                            startActivity(moveIntent);




                                        }
                                    }




        );
    }
}
