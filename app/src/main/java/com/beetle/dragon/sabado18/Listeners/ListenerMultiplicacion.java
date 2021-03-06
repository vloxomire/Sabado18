package com.beetle.dragon.sabado18.Listeners;

import android.content.Intent;
import android.view.View;

import com.beetle.dragon.sabado18.Interfaz.Resultado;
import com.beetle.dragon.sabado18.Interfaz.Sabado18Activity;

public class ListenerMultiplicacion implements View.OnClickListener {
    Sabado18Activity context;

    public ListenerMultiplicacion(Sabado18Activity context) {
        this.context = context;
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context, Resultado.class);
        Integer multiplicacion =Integer.valueOf(context.getEt1().getText().toString()) * Integer.valueOf(context.getEt2().getText().toString());
        intent.putExtra("Resultado",multiplicacion);
        context.startActivity(intent);
    }
}
