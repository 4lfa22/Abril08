package com.softtek.modelo.Ejercicio8;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multiplicar() {
        return num1 * num2;
    }

    public double dividir() throws CalculadoraException {
        if (num2 == 0) {
            throw new CalculadoraException("División por cero no permitida");
        }
        return num1 / num2;
    }
}

