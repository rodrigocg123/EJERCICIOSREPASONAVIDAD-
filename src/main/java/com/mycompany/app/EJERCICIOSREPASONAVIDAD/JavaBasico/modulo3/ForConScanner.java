package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo3;

import java.util.Scanner;

public class ForConScanner {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("SUMA DE NUMEROS:");
        int i;
        int suma = 0;
        int f = 0;
        f = entrada.nextInt();
        for (i = 1; i<11 ;i++){
            System.out.println("Numero: " + i);
            suma = suma + f;
            System.out.println("Suma actual :"+ suma);
        }
        System.out.println("TOTAL: " + suma);
        System.out.println("Multiplicacion de numeros con scanner:");
        int numero;
        numero= entrada.nextInt();
        for(i = 1; i<11;i++){
            int valor = i * numero;
            System.out.println( i + " x " + numero + " = " + valor);
        }
    
    }
    
}
