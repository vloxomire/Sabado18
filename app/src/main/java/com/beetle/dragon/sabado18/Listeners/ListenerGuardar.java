package com.beetle.dragon.sabado18.Listeners;

import android.view.View;
import android.widget.Toast;

import com.beetle.dragon.sabado18.Interfaz.Resultado;
import com.beetle.dragon.sabado18.Models.Calculadora;

public class ListenerGuardar implements View.OnClickListener {
    private Resultado context;

    public ListenerGuardar(Resultado context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
    context.setUnaCalculadora(new Calculadora());
    context.getUnaCalculadora().setResultado(Integer.valueOf(context.getEt3().getText().toString()));
    context.getControladorCalculadora().guardarCalculadora(context.getUnaCalculadora());
        Toast.makeText(context,"Guardado"+ toString().valueOf(context.getControladorCalculadora().cantidadCalculadora()),Toast.LENGTH_SHORT).show();
    }
}
