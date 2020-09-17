package com.example.actividad_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.Spinner;

import java.util.Timer;
import java.util.TimerTask;

public class Commentary_act extends AppCompatActivity {
    private Spinner spin;
    private ProgressBar progress;
    private RatingBar rating;
    private int progreso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commentary_act);
        spin = (Spinner) findViewById(R.id.spinnerProductos);
        progress = (ProgressBar) findViewById(R.id.progressBar);
        rating = (RatingBar) findViewById((R.id.ratingBar));
        String [] listaProductos = {"(Seleccione)","Televisor","Refrigerador","Horno","Lavadora"};
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listaProductos);
        spin.setAdapter(adapt);
    }
    public void Calificar(View view){
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                progreso++;
                progress.setProgress(progreso);
            }
        };
        long delay = 0;
        long period = 100;
        t.schedule(tt,delay,period);
        rating.setRating(3);
    }
    public void Limpiar (View view){
        rating.setRating(0);
        spin.setSelection(0);
        progress.setProgress(0);
    }

}