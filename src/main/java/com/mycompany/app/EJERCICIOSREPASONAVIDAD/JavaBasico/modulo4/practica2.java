package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo4;

import java.util.Scanner;

public class practica2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Lista Notas: ");
        System.out.println("-------------------------------------------");
        int i;
        int ListaNotas [] = new int []{5,8,10,3,0};
        for (i=0 ;i<ListaNotas.length; i++){
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        System.out.println("Lista Aprobados: ");
        System.out.println("--------------------------------");
        int NumeroAprobados = 0;
        int posicionAprobados=0;
        int [] ListaAprobados = new int[3]; 
        for (i=0;i<ListaAprobados.length;i++){
            ListaAprobados[posicionAprobados] = ListaNotas [i];
            posicionAprobados ++;
        }
        for (i=0;i<ListaAprobados.length;i++){
            System.out.println(ListaAprobados[i]);
        }
        System.out.println("--------------------------------");
        System.out.println("El numero de suspensos es de: " + NumeroAprobados);
        System.out.println("--------------------------------");
        System.out.println("Lista Suspensos: ");
        System.out.println("--------------------------------");
        int ListaSuspensos[] = new int[2];
        // int NumeroAprobados = 0;


    }
}
