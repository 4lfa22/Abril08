package com.softtek.modelo.Ejercicio5;

public class Director implements Empleado{
    private Informe informe;

    @Override
    public String getInforme() {
        return "informe";
    }

    @Override
    public String getTareas() {
        return "tareas";
    }

    public Director(Informe informe) {
        this.informe = informe;
    }
}
