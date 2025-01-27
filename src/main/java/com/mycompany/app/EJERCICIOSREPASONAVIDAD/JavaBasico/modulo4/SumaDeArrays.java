package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo4;

public class SumaDeArrays {
    public static void main(String[] args) {
        int i;
        //sumar Arrays
        int [] listanº1= new int[] {4,5,6,7,4,9};
        int total = 0;
        for (i=0;i<listanº1.length;i++){
            System.out.println(i + " valores " + listanº1 [i]);
            total = total + listanº1[i];        
            System.out.println("suma por el momento: " + total);
        }
        System.out.println("La suma de todos los elementos del array es: " + total);

    }
}
