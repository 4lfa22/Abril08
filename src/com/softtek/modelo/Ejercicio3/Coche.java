package com.softtek.modelo.Ejercicio3;

public class Coche implements IVehiculo{
    private int deposito;

    @Override
    public String moverse() {
        if(deposito>0){
            return "Moverse";
        }else{
            return "No se mueve";
        }
    }

    public Coche(){

    }

    public Coche(int deposito){
        this.deposito=deposito;
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
