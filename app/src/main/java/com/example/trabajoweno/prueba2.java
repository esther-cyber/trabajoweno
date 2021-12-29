package com.example.trabajoweno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class prueba2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.prueba2);
        Button comenzar = (Button) findViewById(R.id.boton1);

        comenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent comenzar = new Intent(prueba2.this, pantallaFrecuencias.class);
                startActivity(comenzar);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

            }
        });
    }
}