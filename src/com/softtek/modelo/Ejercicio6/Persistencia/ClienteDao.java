package com.softtek.modelo.Ejercicio6.Persistencia;

import com.softtek.modelo.Ejercicio6.Modelo.Cliente;

public class ClienteDao {
    private IDAO conexion;

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }
}
