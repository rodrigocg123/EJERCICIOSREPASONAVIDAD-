package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class ObtenerElMayor {
    public static void main(String args[]) {
        //inicio la i para el bucle for
        int i;
        //Iniciación del Array
        int[] listanº1 = new int[] { 4, 6, 10, 9 };
        //Declaración de las variables del mayor y el menor
        int mayor =listanº1[0];
        int menor = listanº1[0];
        
        for (i = 0; i < listanº1.length; i++) {
            //Valor mayor del array
           if (mayor<listanº1[1]){
                mayor= listanº1[1];
            }else if (mayor<listanº1[2]){ 
                mayor=listanº1[2];    
            }else if (mayor<listanº1[3]){
                mayor= listanº1[3];
            }
            //Valor menor del array
            if (menor>listanº1[1]){
                menor = listanº1[1];
            }else if(menor>listanº1[2]){
                menor= listanº1[2];
            }else if (menor>listanº1[3]){
                menor = listanº1[3];
            }
        }
       System.out.println("El numero mas grande del array es: " + mayor + " y el menor es: " + menor + ".");
    }
}
