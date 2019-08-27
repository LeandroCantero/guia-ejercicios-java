package ar.edu.unahur.obj2.ejercicio1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String[] nombresAlumnos= {"José", "Leandro", "Carlos", "Maria", "Lautaro"};
        char letra;
        Scanner letraUsuario = new Scanner(System.in);
        System.out.println("Digite una letra:");
        letra = letraUsuario.nextLine().charAt(0);
        alumnosConLetra(letra,nombresAlumnos);

    }

    public static void alumnosConLetra(char letra, String[] alumnos){
        for(int i = 0; i < alumnos.length; i++){
            if(letra == alumnos[i].charAt(0)){
                System.out.print(alumnos[i] + " ");
            }
        }
    }
}
