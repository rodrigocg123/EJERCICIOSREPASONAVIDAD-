package com.mycompany.app.EJERCICIOSREPASONAVIDAD;
import java.util.*;
public class BooleanConIf {
    public static void main (String args[]){
        Scanner entrada = new Scanner (System.in);
        boolean oferta = false;
       
        System.out.println("¿Que nota tienes? :");
        int nota = entrada.nextInt();
        
        if(nota>=6 && nota<=10){
            System.out.println("¿Estan los articulon de oferta?");
            oferta = entrada.nextBoolean();
            if (nota>5 && nota<=8){
                System.out.println("¡¡Compramos el balón!!");
                if (oferta==true){
                    System.out.println("¡¡Con la camiseta de cristiano!!");
                }
            } else if (nota<=10 && nota>=9){
                System.out.println("¡¡Compramos el movil!!");
                if(oferta==true){
                    System.out.println("¡¡Con auriculares!!");
                }
            }else if (nota<0 || nota>10){
                System.out.println("valor invalido");
            }
        }else if ( nota>=3 && nota<5 ){
            System.out.println("Hay que estudiar mas.");
        } else if (nota<3  && nota>=0){
            System.out.println("Muy mal");
        }else if (nota==5){
            System.out.println("Has aprobado muy justito");
        }
    }
}
