package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class EjemploAnidamientosConFor {
    public static void main(String[] args) {
        int i;
        int x;
        for (i = 0 ; i<5 ; i++){
            System.out.println("bucle I: "  + i);
            for(x=0 ; x<5 ; x++){
                System.out.println("bucle X: " + x);
            }
        }
    }
}
