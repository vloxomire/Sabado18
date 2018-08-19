package com.beetle.dragon.sabado18.Interfaz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.beetle.dragon.sabado18.R;

public class Sabado18Activity extends Activity {
    private EditText et1,et2;
    private Button suma, resta, division, multiplicacion;
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
    }
}
