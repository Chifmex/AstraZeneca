package com.example.astrazeneca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Informacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);

        Button Rastreo = (Button)findViewById(R.id.button10);
        Button Caracteristica = (Button)findViewById(R.id.button4);
        Button Calendario = (Button)findViewById(R.id.button5);
        Button Regresar = (Button)findViewById(R.id.button11);

        Rastreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),Rastreo.class);
                startActivity(myIntent);

            }
        });
        Caracteristica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),Caracteristica.class);
                startActivity(myIntent);

            }
        });
        Calendario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),Calendario.class);
                startActivity(myIntent);

            }
        });
        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),Lista.class);
                startActivity(myIntent);

            }
        });


    }
}
