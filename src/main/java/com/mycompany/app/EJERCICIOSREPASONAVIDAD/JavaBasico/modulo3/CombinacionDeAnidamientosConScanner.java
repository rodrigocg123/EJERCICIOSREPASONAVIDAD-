package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo3;

import java.util.Scanner;

public class CombinacionDeAnidamientosConScanner {
    public static void main(String[] args) {
        System.out.println("BIENVENIDO");
        Scanner entrada = new Scanner (System.in);
        int i; 
        System.out.println("¿Por que numero quieres dividir?: ");
        int numero = entrada.nextInt();
        int iteraciones = 0;
        for (i=1 ; i<=100; i++){
            if (i%numero == 0){
                iteraciones ++;
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("El numero 100 es divisible entre " + numero + " este numero de veces: " + iteraciones);   
    }
}
