package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class EjemploDoWhile {
    public static void main(String[] args) {
        //siempre se ejecuta al menos 1 vez el do aunque no se respete el limite establecido por el while
        int i = 100;
        do{
            System.out.println(i);
            i = i + 1;
        }while(i<10);
    }
}
