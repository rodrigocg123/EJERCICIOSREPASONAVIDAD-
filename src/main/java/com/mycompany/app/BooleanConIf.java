package com.mycompany.app;

import java.util.Scanner;

public class BooleanConIf {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean oferta=false; //segun cambie el valor de ofertar entre true/false aparecera la compra de auriculares o no 
        System.out.println("¿Que nota tienes?:");
        int nota=entrada.nextInt();

        System.out.println("¿Estamos de oferta?:");
        oferta = entrada.nextBoolean(); //segun contestemos con un true/false ejecuta el if de oferta o no 
        
        if (nota<5 && nota>3) {
            System.out.println("¡¡Hay que estudiar mas !!");
        } else if(nota>=0 && nota<=3){
            System.out.println("Muy mal");
        }else if (nota==5) {
            System.out.println("Has aprobado muy justito");
        }else if(nota>5 && nota<9) {
            System.out.println("Compramos el balon!");
            if (oferta==true){
                System.out.println("¡¡Con camiseta de RONALDO!!");
            }
        }else if(nota==10 && nota>=9){
            System.out.println("Compramos el movil!");
            if (oferta==true){
                System.out.println("¡¡Con auriculares!!");
            }
        }if (nota<0 || nota>10){
            System.out.println("Datos Invalidos");
        }
    }

}
