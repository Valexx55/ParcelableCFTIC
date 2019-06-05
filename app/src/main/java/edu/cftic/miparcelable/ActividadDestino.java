package edu.cftic.miparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ActividadDestino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_destino);

        setContentView(R.layout.activity_actividad_destino);

        Log.e("DESTINO", "En la actividad destino");

        Intent intent = getIntent();

        Persona p = (Persona)intent.getExtras().get ("persona");
        PersonaParcelable pp = (PersonaParcelable)intent.getExtras().get ("personap");


        Log.d("Persona ", p.getNombre() + " " + p.getEdad());
        Log.d("Persona Parcelable ", pp.toString());

        TextView tv = (TextView)findViewById(R.id.cajaperson);
        TextView tv2 = (TextView)findViewById(R.id.cajapersonp);
        tv.setText(p.getNombre() + " " + p.getEdad());
        tv2.setText(pp.toString());

    }
}
