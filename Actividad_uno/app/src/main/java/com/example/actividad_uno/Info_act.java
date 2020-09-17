package com.example.actividad_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Info_act extends AppCompatActivity {
    private String info;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_act);
        textView = (TextView) findViewById(R.id.textViewInfo);
        info = "Bienvenidos a la aplicación de Ebay 2020 donde vamos a representar información acerca de nuestros productos asociados, donde queremos implementar una aplicación básica de calificación y calcular productos y sus envíos a bajo coste ademas de gestionar la información y saldos asociados al cliente para poder apagar bajo distintos medios de pago.";
        textView.setText(info);
    }
}