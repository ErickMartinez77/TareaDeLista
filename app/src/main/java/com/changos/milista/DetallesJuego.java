package com.changos.milista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetallesJuego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_juego);

        TextView titulo = (TextView) findViewById(R.id.titulodescripcion);
        TextView detalles = (TextView) findViewById(R.id.descripcion);

        Intent intent = getIntent();
        Bundle b = ((Intent) intent).getExtras();

        if (b!=null){
            titulo.setText(b.getString("TIT"));
            detalles.setText(b.getString("DET"));
        }
    }
}
