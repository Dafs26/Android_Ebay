package com.example.actividad_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Product_act extends AppCompatActivity {
    private EditText etProduct, etMonto;
    private CheckBox cb;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_act);
        etProduct = (EditText) findViewById(R.id.editTextProducto);
        etMonto = (EditText) findViewById(R.id.editTextMonto);
        cb = (CheckBox) findViewById(R.id.checkBoxDomicilio);
        text = (TextView) findViewById(R.id.textViewTotal);
    }
    public void Calcular(View v){
        int value;
        int monto;
        String product;
        product = etProduct.getText().toString().toLowerCase();
        try {
            monto = Integer.parseInt(etMonto.getText().toString());
        }catch (Exception e){
            text.setText("Ingrese monto");
            return;
        };
        switch (product){
            case "televisor":
                value = (cb.isChecked()) ? 129000 + 14500 : 129000;
                break;
            case "microondas":
                value = (cb.isChecked()) ? 50000 + 5500 : 50000;
                break;
            case "lavadora":
                value = (cb.isChecked()) ? 100000 + 25000 : 100000;
                break;
            default:
                text.setText("Item no encontrado");
                return;
        }
        if(value<monto)
            text.setText("Pagado, cambio: $" + String.valueOf(monto - value));
        else if(value == monto)
            text.setText("Pagado");
        else
            text.setText("Deuda: $" + String.valueOf(value - monto));
    }
}