package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class EjemploBucleFor {
    public static void main(String[] args) {
        int i;
        int numero = 2;
        System.out.println(" TABLA DEL 2 ");
        for(i=0;i<=10;i++){
            
            System.out.println( numero + " x " + i);
            System.out.println("Valor: " + i * 2);
        }
        int suma = 0;
        System.out.println("SUMA DE NUMEROS");
        for(i=0;i<=10;i++){
            System.out.println("Numero " + i);
            suma = suma+i;
            System.out.println("Suma actual: " + suma);
        }
        System.out.println("TOTAL: " + suma);
        
    }
}
