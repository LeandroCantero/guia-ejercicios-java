package Ejercicio33;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        menu();

        boolean trueOrFalse = true;
        while(trueOrFalse){
            Scanner scan = new Scanner(System.in);
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
                    menu();
                    break;

                case 2:
                    System.out.println("Nombre:");
                    String nombreAsignatura = scan.next();
                    System.out.println("Horas semanales:");
                    int horasSemanales = scan.nextInt();
                    crearAsignatura(nombreAsignatura, horasSemanales);
                    menu();
                    break;

                case 3:
                    System.out.println("--------Alumno--------:");
                    System.out.println("Nombre:");
                    String nombre2 = scan.next();
                    System.out.println("Apellido:");
                    String apellido2 = scan.next();
                    System.out.println("Email:");
                    String email2 = scan.next();
                    Alumno alumno = new Alumno(nombre2, apellido2, email2);
                    System.out.println("--------Asignatura--------");
                    System.out.println("Nombre:");
                    String nombreAsig = scan.next();
                    System.out.println("Horas Semanales:");
                    int horasSem = scan.nextInt();
                    Asignatura asignatura = new Asignatura(nombreAsig, horasSem);
                    matricularAlumno(alumno, asignatura);
                    menu();
                    break;

                case 4:
                    System.out.println("Asignatura:");
                    System.out.println("Nombre:");
                    String nombreAsig2 = scan.next();
                    System.out.println("Horas Semanales:");
                    int horasSem2 = scan.nextInt();
                    Asignatura asignatura1 = new Asignatura(nombreAsig2, horasSem2);
                    listadoMatriculados(asignatura1);
                    menu();
                    break;

                case 5:
                    System.out.println("Alumno:");
                    System.out.println("Nombre:");
                    String nombreA = scan.next();
                    System.out.println("Apellido:");
                    String apellidoA = scan.next();
                    System.out.println("Email:");
                    String emailA = scan.next();
                    Alumno alumno1 = new Alumno(nombreA, apellidoA, emailA);
                    asignaturasYHorasALumno(alumno1);
                    menu();
                    break;

                case 6:
                    System.out.println("Salir");
                    trueOrFalse = false;
                    break;

                default:
                    System.out.println("El numero ingresado no está entre las opciones");
                    menu();
                    break;
            }

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

    public static void menu(){
        System.out.println("--------------------");
        System.out.println("1.Crear nuevo alumno");
        System.out.println("2.Crear nueva asignatura.");
        System.out.println("3.Matricular alumno en asignatura.");
        System.out.println("4.Listado de alumnos matriculados en una asignatura.");
        System.out.println("5.Listado de asignaturas en las que está matriculado un alumno y total de horas.");
        System.out.println("6.Salir");
    }

}
