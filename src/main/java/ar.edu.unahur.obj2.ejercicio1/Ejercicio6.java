package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int matriz [] [] = new int [3] [3];
        pedirMatriz(matriz);
    }
    private static void pedirMatriz(int [] [] matriz){
        Scanner consola = new Scanner(System.in);
        for (int x = 0; x < matriz.length; x++){
            for (int y = 0; y < matriz[x].length; y++){
                System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                matriz[x][y] = consola.nextInt();
                System.out.println(("[" + x + "," + y + "] = " + matriz[x][y]));
            }
        }
    }
}
