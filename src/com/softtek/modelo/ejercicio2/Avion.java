package com.softtek.modelo.ejercicio2;

public class Avion extends Vehiculo implements ObjetoVolador{
    @Override
    public String despegar() {
        return "Despegando";
    }

    @Override
    public String aterrizar() {
        return "Aterrizando";
    }

    @Override
    public String volar() {
        return "Volando";
    }
}
