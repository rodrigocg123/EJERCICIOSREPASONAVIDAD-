package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo3;

public class EjemploCombinacionDeAnidamientos {
    public static void main(String[] args) {
        int numero1 = 6;
        int numero2 = 3;
        //el operador % o modulo nos devuelve el resto de una division entera de dos numeros
        int resto = numero1 % numero2;
        System.out.println("EL resto que queda en la division 6/3 es = " + resto);
        //esta operacion da 0 ya que el resto que queda en la division entre 6 / 3  es 0 

        System.out.println("NUMEROS DIVISIBLES ENTRE 3 DE 0 A 100 ");
        int i;
        int iteraciones = 0;
        for (i=1 ; i<=100 ; i++){
            System.out.println(i);
            if (i%3 == 0){
                iteraciones ++;
               
            }
            
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Hay " + iteraciones + " numeros divisibles entre 3.");
    }
}
