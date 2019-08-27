package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio3 {
    public static void main(String[] args) {
        int[] temperaturas = new int[23];
        imprimirTemperaturas(temperaturas);
        tempMaxyMin(temperaturas);

    }

    public static void imprimirTemperaturas(int[] temperaturas){
        for(int i = 0; i < temperaturas.length; i++){
            System.out.println(temperaturas[i]);
        }
    }

    public static int tempMaxyMin(int [] temperaturaMax){
        int max = 0;
        int min = 9999999;
        for(int i = 0; i < temperaturaMax.length; i++){
            if(temperaturaMax[i] > max){
                max = temperaturaMax[i];
            }
            if(temperaturaMax[i] < min){
                min = temperaturaMax[i];
            }
        }
        return max;
    }

    public String asteriscos(){

        return null;
    }
}
