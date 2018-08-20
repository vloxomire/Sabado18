package com.beetle.dragon.sabado18.DAO;

import com.beetle.dragon.sabado18.Models.Calculadora;

import java.util.ArrayList;

public class DaoCalculadora {
    ArrayList<Calculadora> calculadoraArrayList = new ArrayList<>();
    public void addCalculadora(Calculadora unaCalculadora){
        calculadoraArrayList.add(unaCalculadora);
    }
    public Integer getSizeArrayCalculadorea(){
        return calculadoraArrayList.size();
    }
    public Calculadora getCalculadora(Integer i){
        return calculadoraArrayList.get(i);
    }
}
