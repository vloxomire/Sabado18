package com.beetle.dragon.sabado18.Interfaz;

import android.app.Activity;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.beetle.dragon.sabado18.Listeners.ListenerDivision;
import com.beetle.dragon.sabado18.Listeners.ListenerMultiplicacion;
import com.beetle.dragon.sabado18.Listeners.ListenerResta;
import com.beetle.dragon.sabado18.Listeners.ListenerSuma;
import com.beetle.dragon.sabado18.R;

public class Sabado18Activity extends Activity {
    private EditText et1,et2;
    private Button suma, resta, division, multiplicacion;
    //Instancio Listener
    private ListenerSuma listenerSuma;
    private ListenerResta listenerResta;
    private ListenerDivision listenerDivision;
    private ListenerMultiplicacion listenerMultiplicacion;

    public EditText getEt1() {
        return et1;
    }
    public EditText getEt2() {
        return et2;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sabado18);

    et1=findViewById(R.id.et1);
    et2=findViewById(R.id.et2);
    suma=findViewById(R.id.suma);
    resta=findViewById(R.id.resta);
    division=findViewById(R.id.division);
    multiplicacion=findViewById(R.id.multiplicacion);
    //creo objetos Listener
        listenerSuma= new ListenerSuma(this);
        listenerResta= new ListenerResta(this);
        listenerDivision= new ListenerDivision(this);
        listenerMultiplicacion = new ListenerMultiplicacion(this);
        //Seteo los onclick de los escuchadores
        suma.setOnClickListener(listenerSuma);
        resta.setOnClickListener(listenerResta);
        division.setOnClickListener(listenerDivision);
        multiplicacion.setOnClickListener(listenerMultiplicacion );
    }
}
