package com.softtek.modelo.ejercicio2;

public class Barcaza extends Vehiculo implements  Nautico{
    @Override
    public String atracar() {
        return "Atracando";
    }

    @Override
    public String navegar() {
        return "Navegando";
    }
}
