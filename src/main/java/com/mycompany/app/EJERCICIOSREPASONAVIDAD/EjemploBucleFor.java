package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class EjemploBucleFor {
    public static void main(String[] args) {
        int i;
        int numero = 2;
        System.out.println(" TABLA DEL 2 ");
        for(i=0 ; i<=10 ; i++){ 
            System.out.println( numero + " x " + i);
            System.out.println("Valor: " + i * 2);
        }

        int suma = 0;
        System.out.println("SUMA DE NUMEROS");
        for(i=0 ; i<=10 ; i++){
            System.out.println("Numero " + i);
            suma = suma+i;
            System.out.println("Suma actual: " + suma);
        }
        System.out.println("TOTAL: " + suma);

        System.out.println("MULTIPLICACION FACTORIAL:"); //almacena los valores de la multiplicaciones anteriores y las multiplica por el valor nuevo de i
        int factorial = 1;
        for(i = 1 ; i <= 5; i++){
            factorial= factorial * i;
            System.out.println("iteracion: " + i);
            System.out.println("factorial de iteracion: " + factorial);
        }   
        System.out.println("iteracion total: " + factorial);
        
        System.out.println("BUCLE INVERSO:"); //los valores salen en el orden contrario a un bucle standard
        for (i=10 ; i>=0 ; i--){
            System.out.println(i);
        }
    }
}
