package com.beetle.dragon.sabado18.Interfaz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.beetle.dragon.sabado18.Controllers.ControladorCalculadora;
import com.beetle.dragon.sabado18.Listeners.ListenerFase3;
import com.beetle.dragon.sabado18.Listeners.ListenerGuardar;
import com.beetle.dragon.sabado18.Listeners.ListenerObtener;
import com.beetle.dragon.sabado18.Models.Calculadora;
import com.beetle.dragon.sabado18.R;

public class Resultado extends Activity {
    private EditText et3;
    private Button guardar, fase3, obtener;
    private Calculadora unaCalculadora;
    private ListenerGuardar listenerGuardar;
    private ListenerObtener listenerObtener;
    private ListenerFase3 listenerFase3;
    private ControladorCalculadora controladorCalculadora = new ControladorCalculadora();

    public EditText getEt3() {
        return et3;
    }

    public Calculadora getUnaCalculadora() {
        return unaCalculadora;
    }

    public void setUnaCalculadora(Calculadora unaCalculadora) {
        this.unaCalculadora = unaCalculadora;
    }

    public ControladorCalculadora getControladorCalculadora() {
        return controladorCalculadora;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        et3=findViewById(R.id.et3);
        guardar=findViewById(R.id.guardar);
        fase3=findViewById(R.id.fase3);
        obtener=findViewById(R.id.obtener);
        listenerGuardar = new ListenerGuardar(this);
        listenerObtener = new ListenerObtener(this);
        listenerFase3 = new ListenerFase3(this);
        guardar.setOnClickListener(listenerGuardar);
        obtener.setOnClickListener(listenerObtener);
        fase3.setOnClickListener(listenerFase3);
        //Creo Bolsa para recibir las clases
        Bundle bolsaX = new Bundle();
        bolsaX= getIntent().getExtras();    //Guardo los datos pasado del Intent
        Integer datoX= bolsaX.getInt("Resultado");
        et3.setText(String.valueOf(datoX));
    }
}
