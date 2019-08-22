package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args){
        numerosInverso();
    }

    public static void numerosInverso(){
        int[] numeros = new int[10];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresar datos numéricos:");
        for(int i=0; i<numeros.length; i++){
            System.out.print((i+1)+" - Digite un número: ");
            numeros[i] = entrada.nextInt();
        }
        for(int i= numeros.length-1; i > 0; i--){
            System.out.println(numeros[i]);
        }
    }
}