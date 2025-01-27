package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo4;

public class DuplicacionDeValores {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("Lista sin duplicar: ");
        System.out.println("-----------------------------------");
        int Lista1[] = new int[] { 1, 2, 3 };
        for (int i = 0; i < Lista1.length; i++) {
            System.out.println(Lista1[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("Lista duplicada: ");
        System.out.println("-----------------------------------");
        duplicar(Lista1);
        for (int j = 0; j < Lista1.length; j++) {
            System.out.println(Lista1[j]);
        }
    }

    public static void duplicar(int[] elementos) {

        for (int i = 0; i < elementos.length; i++) {
            elementos[i] = elementos[i] * 2;
        }
    }
}
