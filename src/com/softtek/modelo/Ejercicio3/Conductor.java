package com.softtek.modelo.Ejercicio3;

public class Conductor {

    private IVehiculo vehiculo;

    public String conducir(){
        return "Conduciendo";
    }

    public Conductor(IVehiculo vehiculo){
        this.vehiculo=vehiculo;
    }

    public Conductor(){

    }

    public IVehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(IVehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
}
