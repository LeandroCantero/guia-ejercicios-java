package main.java.ar.edu.unahur.obj2.ejercicio1;

/* Realizar un programa que cuente el número de veces que aparece cada una de las letras del alfabeto en un texto introducido por el usuario.
El recuento se hará mediante la función contarLetras() y se almacenará el total de cada letra en la posición correspondiente de un array.
Después se mostrará el resultado en pantalla mediante la función visualizarRecuento().
Nota: Recordad que para acceder a los caracteres individuales de un String disponemos del método .charAt().*/

public class Ejercicio5 {
    public static void main(String[] args) {
        String texto = "hola mundo";
        int[] cantidad = new int[texto.length()];
        contarLetras(texto, cantidad);
        visualizarRecuento(cantidad);

    }

    public static void contarLetras(String texto, int [] cantidad){
        String vacio =" ";;
        for (int i = 0; i < texto.length(); i++){
            for(int j = 0; j < texto.length(); j++){
                if(texto.charAt(i) == texto.charAt(j) && texto.charAt(i) != vacio.charAt(0)){
                    cantidad[i] ++;
                }
            }
        }
    }

    public static void visualizarRecuento(int [] cantidad){
        for(int i = 0; i < cantidad.length; i++){
            System.out.print(cantidad[i]);
        }
    }
}
