package com.beetle.dragon.sabado18.Listeners;

import android.content.Intent;
import android.view.View;

import com.beetle.dragon.sabado18.Interfaz.Resultado;
import com.beetle.dragon.sabado18.Interfaz.TercerActo;

public class ListenerFase3 implements View.OnClickListener {
    private Resultado context;

    public ListenerFase3(Resultado context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(context,TercerActo.class);
        Integer fase3= Integer.valueOf(context.getEt3().getText().toString());
        intent.putExtra("TercerActo",fase3);
        context.startActivity(intent);
    }
}
