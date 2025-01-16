package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class SumaDeAprobados {
    public static void main(String[] args) {
        int i;
        int [] ListaNotas = new int[] {3,5,6,2,1};
        int SumaDeAprobados= 0;
        int NumeroAprobados = 0;
        for (i=0;i<ListaNotas.length;i++){
            if (ListaNotas[i]>=5){
            SumaDeAprobados = SumaDeAprobados + ListaNotas[i];
            NumeroAprobados++;
            }
        }
        System.out.println("La suma entre las notas aprobadas es de: " + SumaDeAprobados + " puntos.");
        System.out.println("Han aprobado: " + NumeroAprobados + " alumnos.");
        System.out.println("La media de la nota de los examenes aprobados es de " + SumaDeAprobados/NumeroAprobados + " puntos.");
    }
}
