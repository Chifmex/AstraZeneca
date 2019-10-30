package com.example.astrazeneca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class Registro extends AppCompatActivity {

    EditText usuario =  (EditText) findViewById(R.id.editText3);
    EditText contrasena =  (EditText) findViewById(R.id.editText4);
    Button agregar =  (Button) findViewById(R.id.button2);
    Button regresar =  (Button) findViewById(R.id.button3);
    // [START declare_database_ref]
    private DatabaseReference mDatabase;
    // [END declare_database_ref]

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        // [START initialize_database_ref]
        mDatabase = FirebaseDatabase.getInstance().getReference().child("Usuarios");
        // [END initialize_database_ref]

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User nuevo = new User(usuario.getText().toString(),contrasena.getText().toString());
                mDatabase.child(nuevo.Usuario).setValue(nuevo);
                Intent myIntent = new Intent(getBaseContext(),Pagina_Inicio.class);
                startActivity(myIntent);
                //sendNotification(v);

            }
        });
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(myIntent);

            }
        });
    }
}


