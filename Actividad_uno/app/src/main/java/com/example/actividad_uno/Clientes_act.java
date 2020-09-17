package com.example.actividad_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;

public class Clientes_act extends AppCompatActivity {
    private Spinner spin;
    private EditText etproducto;
    private TextView tvsaldo;
    private HashMap<String,Integer> productos = new HashMap<>();
    private int saldo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clientes_act);
        spin =  (Spinner)findViewById(R.id.spinnerClientes);
        etproducto = (EditText) findViewById(R.id.editTextProducto);
        tvsaldo = (TextView) findViewById(R.id.textViewSaldo);
        String [] clientes = {"Mario","Constanza","Fernanda"};
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,clientes);
        spin.setAdapter(adapt);
        productos.put("horno",45000);
        productos.put("espejo",100000);
        productos.put("sillas",80000);
    }
    public void Calcular(View view){
        String producto = etproducto.getText().toString().toLowerCase();
        if(productos.containsKey(producto)){
            switch (spin.getSelectedItemPosition()){
                case 0:
                    saldo = 500000 + productos.get(producto);
                    break;
                case 1:
                    saldo = 320000 + productos.get(producto);
                    break;
                case 2:
                    saldo = 120000 + productos.get(producto);
                    break;
            }
            tvsaldo.setText("Saldo final:" + String.valueOf(saldo));
        }
        else{
            tvsaldo.setText("Ingrese producto correctamente");
        }

    }
}