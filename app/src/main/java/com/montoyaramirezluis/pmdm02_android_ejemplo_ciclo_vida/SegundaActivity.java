package com.montoyaramirezluis.pmdm02_android_ejemplo_ciclo_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        Button b = findViewById(R.id.bCerrar);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        finish(); // Finalizamos la actividad
    }
}