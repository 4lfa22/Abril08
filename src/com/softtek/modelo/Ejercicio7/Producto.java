package com.softtek.modelo.Ejercicio7;

import java.util.UUID;

public class Producto {
    private UUID id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public void comprobar() throws ProductoException {
        if (id == null){
            throw new ProductoException("El producto no tiene asignado un ID");
        }
    }

    public Producto(UUID id, String nombre, double precio, String proveedor, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }

    public Producto() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
