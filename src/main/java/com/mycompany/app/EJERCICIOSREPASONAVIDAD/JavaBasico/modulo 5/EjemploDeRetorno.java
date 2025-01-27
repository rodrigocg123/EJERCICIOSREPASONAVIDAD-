package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class EjemploDeRetorno {
    public static void main(String[] args) {
        int numero1 = 2;
        int numero2 = 3;
        int resultado = suma(numero1, numero2);
        System.out.println(resultado);

    }

    static int suma(int a, int b) {
        return a + b;
    }
}
