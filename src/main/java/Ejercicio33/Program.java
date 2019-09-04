package Ejercicio33;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner opcion = new Scanner(System.in);
        int op = opcion.nextInt();

        switch (op){

            case 1:

        }

    }

    public Alumno crearAlumno(String nombre, String apellido, String email){
        return new Alumno(nombre, apellido, email);
    }

    public Asignatura crearAsignatura(String nombre, int horasSemanales){
        return new Asignatura(nombre, horasSemanales);
    }

    public void matricularAlumno(Alumno alumno, Asignatura asignatura){
        alumno.matricular(asignatura);
    }

    public void listadoMatriculados(Asignatura asignatura){
        System.out.println("Alumnos matriculados:" + asignatura.getAlumnos());
    }

    public void asignaturasYHorasALumno(Alumno alumno){
        System.out.println("Asignaturas:" + alumno.getAsignaturas() + "Horas totales:" + alumno.horasTotales());
    }


}
