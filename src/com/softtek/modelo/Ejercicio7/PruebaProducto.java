package com.softtek.modelo.Ejercicio7;

import java.util.UUID;

public class PruebaProducto {
    public static void main(String[] args) {
        // Crear un producto con ID asignado
        Producto producto1 = new Producto(UUID.randomUUID(), "Producto 1", 10.99, "Proveedor 1", "Descripción 1");
        try {
            producto1.comprobar();
            System.out.println("Producto 1 válido");
        } catch (ProductoException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Crear un producto sin ID asignado
        Producto producto2 = new Producto();
        try {
            producto2.comprobar();
            System.out.println("Producto 2 válido");
        } catch (ProductoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

