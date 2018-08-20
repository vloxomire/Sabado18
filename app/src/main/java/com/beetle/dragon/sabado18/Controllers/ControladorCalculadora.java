package com.beetle.dragon.sabado18.Controllers;

import com.beetle.dragon.sabado18.DAO.DaoCalculadora;
import com.beetle.dragon.sabado18.Models.Calculadora;

public class ControladorCalculadora {
    DaoCalculadora daoCalculadora = new DaoCalculadora();

    public void guardarCalculadora(Calculadora datoCalculadora){
        daoCalculadora.addCalculadora(datoCalculadora);
    }
    public Integer cantidadCalculadora(){
        return daoCalculadora.getSizeArrayCalculadorea();
    }
    public Calculadora getCalculadora(Integer c){
        return daoCalculadora.getCalculadora(c);
    }
}
