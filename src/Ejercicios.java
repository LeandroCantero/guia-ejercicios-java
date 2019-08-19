import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {
    public static void main (String [] args){
        buscarMayoresANum();
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

    public static void buscarMayoresANum(){
        List lista = new ArrayList();
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número: ");
        numero = entrada.nextInt();
        int[] numeros = new int[10];
        Scanner entrada2 = new Scanner(System.in);
        for(int i=0; i < numeros.length; i++){
            System.out.print((i+1)+" - Digite un número: ");
            numeros[i] = entrada2.nextInt();
        }

        for(int i=0; i<numeros.length; i++){
            if(numeros[i] > numero){
                lista.add(numeros[i]);
            }
        }
        System.out.println();
        System.out.println("Números mayores a " + numero + ": " + lista);
    }
}