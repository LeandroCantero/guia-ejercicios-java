package Ejercicio33;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1.Crear nuevo alumno");
        System.out.println("2.Crear nueva asignatura.");
        System.out.println("3.Matricular alumno en asignatura.");
        System.out.println("4.Listado de alumnos matriculados en una asignatura.");
        System.out.println("5.Listado de asignaturas en las que está matriculado un alumno y total de horas.");
        System.out.println("6.Salir");

        int opcion = scan.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Nombre:");
                String nombreAlumno = scan.next();
                System.out.println("Apellido:");
                String apellido = scan.next();
                System.out.println("Email:");
                String email = scan.next();
                crearAlumno(nombreAlumno, apellido, email);

            case 2:
                System.out.println("Nombre:");
                String nombreAsignatura = scan.next();
                System.out.println("Horas semanales:");
                int horasSemanales = scan.nextInt();
                crearAsignatura(nombreAsignatura, horasSemanales);

            case 3:
                System.out.println("Alumno:");
                Alumno alumno;
                System.out.println("Asignatura");
                Asignatura asignatura;
                matricularAlumno(alumno, asignatura);
        }


    }

    public static Alumno crearAlumno(String nombre, String apellido, String email){
        return new Alumno(nombre, apellido, email);
    }

    public static Asignatura crearAsignatura(String nombre, int horasSemanales){
        return new Asignatura(nombre, horasSemanales);
    }

    public static void matricularAlumno(Alumno alumno, Asignatura asignatura){
        alumno.matricular(asignatura);
    }

    public static void listadoMatriculados(Asignatura asignatura){
        System.out.println("Alumnos matriculados:" + asignatura.getAlumnos());
    }

    public static void asignaturasYHorasALumno(Alumno alumno){
        System.out.println("Asignaturas:" + alumno.getAsignaturas() + "Horas totales:" + alumno.horasTotales());
    }


}
