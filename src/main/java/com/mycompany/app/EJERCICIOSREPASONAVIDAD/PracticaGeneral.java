package com.mycompany.app.EJERCICIOSREPASONAVIDAD;

public class PracticaGeneral {
    public static void main(String[] args) {
        int i; 
        int NumeroAprobados = 0;
        System.out.println("----------------------------------------");
        System.out.println("Lista Notas: ");
        System.out.println("----------------------------------------");
        int ListaNotas [] = new int[] {7,1,4,5,6} ;
        for (i=0 ; i<ListaNotas.length ; i++) {
            System.out.println(ListaNotas [i]);//recorro el array y lo plasmo por consola
        }
        System.out.println("----------------------------------------");

        System.out.println("Lista De Aprobados: ");

        System.out.println("----------------------------------------");

        int ListaAprobados[] = new int[3];
        int posicionAprobados = 0;
        for (i=0 ; i < ListaNotas.length ; i++){ //recorre el array de notas y elimina las notas menor de 5
            if (ListaNotas[i]>=5){
            ListaAprobados[posicionAprobados] = ListaNotas [i];
            posicionAprobados ++; //suma 1 cada vez que encuentra un numero mayor de 5
            }
        }
        for (i = 0; i < ListaAprobados.length ; i++){
            System.out.println(ListaAprobados[i]);
        }
        System.out.println("El numero de aprobados es de: " + NumeroAprobados); //plasma por consola el numero de aprobados
        System.out.println("----------------------------------------");
        System.out.println("Lista Suspensos:");
        System.out.println("----------------------------------------");
        int ListaSuspensos [] = new int[2];
        int numeroSuspensos = 0;
        int posicionSuspensos = 0;
       
        for (i = 0 ; i<ListaNotas.length ; i++){
            if (ListaNotas [i] < 5){
                numeroSuspensos++;
            }
        }
        
        for (i=0 ; i <ListaNotas.length ; i++ ){ //recorre el array y cada que que hay un numero menor de 5 suma 1 a la variable
            if (ListaNotas[i] < 5){//recorre el array creado antes cogiendo los datos del array de "Lista de Notas" que estan suspensos
                ListaSuspensos[posicionSuspensos] = ListaNotas [i];
                posicionSuspensos++;
            }
        }
        for(i=0 ; i<ListaSuspensos.length; i++){
           System.out.println(ListaSuspensos [i]); //plasma el array por pantalla 
        }
        System.out.println("El numero de suspensos es de: " + numeroSuspensos);//plasma por consola el numero de suspensos
        System.out.println("---------------------------------------");        
    }
}
