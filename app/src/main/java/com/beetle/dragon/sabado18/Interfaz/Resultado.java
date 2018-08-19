package com.beetle.dragon.sabado18.Interfaz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.beetle.dragon.sabado18.R;

public class Resultado extends Activity {
    private EditText et3;
    private Button guardar, fase3;

    public EditText getEt3() {
        return et3;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        et3=findViewById(R.id.et3);
        //Creo Bolsa para recibir las clases
        Bundle bolsaX = new Bundle();
        bolsaX= getIntent().getExtras();    //Guardo los datos pasado del Intent
        Integer datoX= bolsaX.getInt("Resultado");
        et3.setText(String.valueOf(datoX));
    }
}