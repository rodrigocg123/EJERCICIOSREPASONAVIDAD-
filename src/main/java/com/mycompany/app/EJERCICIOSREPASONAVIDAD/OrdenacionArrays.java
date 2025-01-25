package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class OrdenacionArrays {
    public static void main(String[] args) {
        int i;
        int ListaNumeros[] = new int[] { 2, 3, 7, 5, 6, 1 };
        boolean noOrdenado = true;
        while (noOrdenado) {
            noOrdenado=false;
            for (i = 0; i < ListaNumeros.length-1; i++) {
                if ((ListaNumeros[i] > ListaNumeros[i + 1])) {
                    // codigo que nos permite intercambiar los valores de dos posiciones del array
                    int temporal = ListaNumeros[i];
                    ListaNumeros[i] = ListaNumeros[i + 1];
                    ListaNumeros[i + 1] = temporal;
                    noOrdenado=true;
                }
            }
        }
        for (i=0; i < ListaNumeros.length;i++){
            System.out.println(ListaNumeros[i]);
        }   
    }
}
    