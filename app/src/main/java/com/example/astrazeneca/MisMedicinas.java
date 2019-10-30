package com.example.astrazeneca;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class MisMedicinas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mis_medicinas);

        Medicina[] medi;
        // Get a reference to our posts
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        DatabaseReference ref = database.child("MisMed");

        Query phoneQuery = ref;
        phoneQuery.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot singleSnapshot : dataSnapshot.getChildren()){
                    Medicina medicina = singleSnapshot.getValue(Medicina.class);
                    Log.e("Hola",medicina.Nombre);
                    DatabaseReference database2 = FirebaseDatabase.getInstance().getReference();
                    DatabaseReference ref2 = database2.child("MisMed");
                    ref2.child(medicina.Nombre).setValue(medicina);
                }
            }
            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.e("Hola", "onCancelled", databaseError.toException());
            }
        });







    }



    }



