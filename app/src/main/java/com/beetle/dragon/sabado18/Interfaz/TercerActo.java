package com.beetle.dragon.sabado18.Interfaz;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.beetle.dragon.sabado18.R;

public class TercerActo extends Activity {
    private EditText et4;
    private Button guardarSql;

    public EditText getEt4() {
        return et4;
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
