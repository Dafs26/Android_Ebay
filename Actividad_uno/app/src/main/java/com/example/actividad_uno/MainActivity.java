package com.example.actividad_uno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private boolean loginConfirmation(){
        EditText usr = (EditText) findViewById(R.id.editTextUser);
        EditText pass = (EditText) findViewById(R.id.editTextPassword);
        return(usr.getText().toString().equalsIgnoreCase("android") && pass.getText().toString().equalsIgnoreCase("123"));
    }
    public void Login (View v){
        if(loginConfirmation()) {
            Intent i = new Intent(this, Menu_act.class);
            startActivity(i);
        }
    }
}