package com.montoyaramirezluis.pmdm02_android_ejemplo_ciclo_vida;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * <p>Programa para comprobar los eventos del ciclo de vida de una aplicación android</p>
 * Si implementamos View.OnClickListener, podemos implementar el setOnClickListener en el onCreate
 * y el método onClick como método de la clase, aunque realmente no se como se haría con varios
 * botones, porque no se como se diferenciarían los botones en el método onClick.
 *
 * @see <a href="https://developer.android.com/guide/components/activities/activity-lifecycle">Ciclo de vida de una actividad</a>
 * @see <a href="https://developer.android.com/guide/components/activities/intro-activities">Introducción a las actividades</a>
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mostramos toast al crear la actividad
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();

        Button b = findViewById(R.id.bAbrir);

        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "onClick", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(this, SegundaActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}