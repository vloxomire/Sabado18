package com.beetle.dragon.sabado18.Interfaz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.beetle.dragon.sabado18.Controllers.ControladorCalculadora;
import com.beetle.dragon.sabado18.Models.Calculadora;
import com.beetle.dragon.sabado18.R;

public class TercerActo extends Activity {
    private EditText et4;
    private Button guardarSql;
    private Calculadora unaCalculadora;
    private ControladorCalculadora controladorCalculadora =new ControladorCalculadora();


    public EditText getEt4() {
        return et4;
    }

    public void setEt4(EditText et4) {
        this.et4 = et4;
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

    public void setControladorCalculadora(ControladorCalculadora controladorCalculadora) {
        this.controladorCalculadora = controladorCalculadora;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        et4=findViewById(R.id.et4);
        guardarSql=findViewById(R.id.guardarSql);

        Bundle bolsaZ = new Bundle();
        bolsaZ = getIntent().getExtras();
        Integer datoZ = bolsaZ.getInt("Resultado");
        et4.setText(String.valueOf(datoZ));
    }
}
