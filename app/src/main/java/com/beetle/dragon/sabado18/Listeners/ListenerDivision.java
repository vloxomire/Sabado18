package com.beetle.dragon.sabado18.Listeners;

import android.content.Intent;
import android.view.View;

import com.beetle.dragon.sabado18.Interfaz.Activity2Activity;
import com.beetle.dragon.sabado18.Interfaz.Sabado18Activity;

public class ListenerDivision implements View.OnClickListener {
    Sabado18Activity context;

    public ListenerDivision(Sabado18Activity context) {
        this.context = context;
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(context,Activity2Activity.class);
        Integer division = Integer.valueOf(context.getEt1().getText().toString()) % Integer.valueOf(context.getEt2().getText().toString());
    }
}
