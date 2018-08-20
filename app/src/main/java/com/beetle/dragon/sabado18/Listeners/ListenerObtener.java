package com.beetle.dragon.sabado18.Listeners;

import android.view.View;
import android.widget.Toast;

import com.beetle.dragon.sabado18.Interfaz.Resultado;

public class ListenerObtener implements View.OnClickListener{
    private Resultado context;
    public ListenerObtener(Resultado context) {
        this.context = context;
    }
    @Override
    public void onClick(View v) {
    Integer id = Integer.valueOf(context.getEtId().getText().toString());
    if (id < context.getControladorCalculadora().cantidadCalculadora()){
        if (context.getControladorCalculadora().cantidadCalculadora()!= 0){
            context.setUnaCalculadora(context.getControladorCalculadora().getCalculadora(id));
            context.getEt3().setText(context.getUnaCalculadora().getResultado());
        }else{
            Toast.makeText(context,"No hay valor",Toast.LENGTH_SHORT).show();
        }}else{
            Toast.makeText(context,"Fuera de rango",Toast.LENGTH_SHORT).show();
        }
    }
    }
