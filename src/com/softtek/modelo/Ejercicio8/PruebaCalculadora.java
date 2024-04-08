package com.softtek.modelo.Ejercicio8;

import java.util.Scanner;

public class PruebaCalculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        Calculadora calculadora = new Calculadora(num1, num2);

        try {
            System.out.println("Suma: " + calculadora.sumar());
            System.out.println("Resta: " + calculadora.restar());
            System.out.println("Multiplicación: " + calculadora.multiplicar());
            System.out.println("División: " + calculadora.dividir());
        } catch (CalculadoraException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }


}
