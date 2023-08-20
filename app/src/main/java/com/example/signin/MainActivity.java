package com.example.signin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] names= {"Ebtihal", "Sara", "Reem", "Noor"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.n, names);
        spinner.setAdapter(arrayAdapter);
    }

};
