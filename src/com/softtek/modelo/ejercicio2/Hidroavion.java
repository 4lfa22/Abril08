package com.softtek.modelo.ejercicio2;

public class Hidroavion extends Avion implements Nautico{
    @Override
    public String despegar() {
        return super.despegar();
    }

    @Override
    public String aterrizar() {
        return super.aterrizar();
    }

    @Override
    public String volar() {
        return super.volar();
    }

    @Override
    public String atracar() {
        return "Atracando";
    }

    @Override
    public String navegar() {
        return "Navegando";
    }
}
