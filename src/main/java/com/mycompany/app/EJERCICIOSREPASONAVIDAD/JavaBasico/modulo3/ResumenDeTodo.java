package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo3;
import java.util.*;
public class ResumenDeTodo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i;
       for (i=1;i<21;i++){
        System.out.println(i);
       }

       System.out.println("-------------------------------------------------");

       System.out.println("Dime un numero entre 0 y 20: ");
       int numero = entrada.nextInt();
       if (numero<10){
        System.out.println("Numero menor que 10");
       }else if (numero>10){
        System.out.println("Numero mayor que 10");
       }else if(numero==10){
        System.out.println("El numero es 10");
       }else if (numero>20){
        System.out.println("Numero incorrecto");
       }else if (numero<0){
        System.out.println("Numero incorrecto");
       }

       while (numero == 20){
        System.out.println("Muy ajustado");
        break;
       }
       
       do{
        System.out.println("Vuelve a intentarlo");
       }while (numero>20);
    }
}
