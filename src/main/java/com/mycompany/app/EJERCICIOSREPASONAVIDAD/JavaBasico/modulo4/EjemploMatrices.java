package com.mycompany.app.EJERCICIOSREPASONAVIDAD.JavaBasico.modulo4;

public class EjemploMatrices {
    public static void main(String[] args){
        //iniciamos una matriz de 3x3
        int matriz[][] = new int [3][3];
        //fila 1
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        //fila 2
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        //fila 3
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;
        //recorre la matriz 
        for (int i = 0;i<matriz.length;i++){
            System.out.println("fila" + i);
            for (int j = 0 ; j<matriz[i].length;j++){
                System.out.println("columna" + j);
            }
        }
        System.out.println("---------------------------------------");
        //saca los valores que hay en cada casilla y te indica en que fila se encuentran
        for (int i = 0;i<matriz.length;i++){
            System.out.println("fila" + i);
            for (int j = 0 ; j<matriz[i].length;j++){
                System.out.println(matriz [i][j]);
            }
        }
        System.out.println("---------------------------------------");
        int sumaTotal = 0;
        for (int i = 0;i<matriz.length;i++){
            for (int j = 0 ; j<matriz[i].length;j++){
                sumaTotal = sumaTotal +matriz [i][j];
            }
        }
        System.out.println("La suma de todos los valores de la matriz da un total de: " + sumaTotal + ".");
    }
}
