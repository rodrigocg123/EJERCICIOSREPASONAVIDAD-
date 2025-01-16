package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class EjemploArrays {
    public static void main(String[] args) {
        //declaracion de un array 
        //Formas: 
        //numero1
        System.out.println("Ejemplo n1 de declarar arrays");
        int [] listanº1 = new int[3];
        listanº1[0] =1;        
        listanº1[1]=2;
        listanº1[2]= 3;
        System.out.println( listanº1[0]);
        System.out.println( listanº1[1]);
        System.out.println( listanº1[2]);
        //numero2
        System.out.println("Ejemplo n2 de declarar arrays");
        int [] listanº2 = new int[] {4,5,6};
        System.out.println(listanº2 [0]);
        System.out.println(listanº2 [1]);
        System.out.println(listanº2 [2]);
        //Como recorrer Arrays 
        int [] listanº3 = new int[] {4,5,6,7,4,9};
        System.out.println("Recorrer Arrays");
        System.out.println(listanº3.length);
        int i;
        
        for (i=0;i<listanº3.length;i++){
            System.out.println("posicion " + i + " con valor " + listanº3[i]);
        }
        



    }
}
