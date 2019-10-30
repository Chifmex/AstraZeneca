package com.example.astrazeneca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        Button informacion = (Button)findViewById(R.id.button8);
        Button mas = (Button)findViewById(R.id.button12);
        Button regresar = (Button)findViewById(R.id.button13);


        informacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),Informacion.class);
                startActivity(myIntent);

            }
        });

        mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),Agregar.class);
                startActivity(myIntent);

            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),Pagina_Inicio.class);
                startActivity(myIntent);

            }
        });

    }
}
