package com.mycompany.app;

import java.util.*;

public class Ejemploswitch {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que dia es hoy?");
        String dia = entrada.nextLine();
        switch (dia) {
            
            case "Lunes":
                System.out.println("Comienso de semana");
                break;
            case "Martes":
                System.out.println("Vamos que queda menos");
                break;
            case "Miercoles":
                System.out.println("Mitad de semana");
                break;
            case "Jueves":
                System.out.println("Mañana viernes!!");
                break;
            case "Viernes":
                System.out.println("FIN DE SEMANA!!");
                break;
            default:
                break;
        }
    }

}
