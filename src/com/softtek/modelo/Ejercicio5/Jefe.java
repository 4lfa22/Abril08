package com.softtek.modelo.Ejercicio5;

public class Jefe implements Empleado {
    private Informe informe;

    @Override
    public String getTareas() {
        return "Tareas";
    }

    @Override
    public String getInforme() {
        return "Informe";
    }

    public Jefe(Informe informe) {
        this.informe = informe;
    }

    public Jefe() {
    }


}
