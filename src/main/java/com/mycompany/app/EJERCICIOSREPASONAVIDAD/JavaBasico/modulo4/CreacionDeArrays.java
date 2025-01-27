package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo4;

public class CreacionDeArrays {
    public static void main(String[] args) {
        int i;
        int[] ListaNotas = new int[] { 3, 5, 6, 2, 1 };
        int NumeroAprobados = 0;
        for (i = 0; i < ListaNotas.length; i++) {
            if (ListaNotas[i] >= 5) {
                NumeroAprobados++;
            }
        }
        System.out.println("El numero de aprobados es de: " + NumeroAprobados);

        int[] ListaAprobados = new int[2];
        int posicionAprobados = 0;
        for (i = 0; i < ListaNotas.length; i++) {
            if (ListaNotas[i] >= 5) {
                ListaAprobados [posicionAprobados] = ListaNotas [i];
                posicionAprobados++;
            }
        }
        System.out.println("Lista aprobados: ");
        for (i = 0; i < ListaAprobados.length ; i++){
            System.out.println(ListaAprobados[i]);
        }
    }
}
