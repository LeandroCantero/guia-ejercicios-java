package Ejercicio33;

import java.util.HashSet;
import java.util.Set;

public class Asignatura {
    private String nombre;
    private int horasSemanales;
    private Set<Alumno> alumnos = new HashSet<>();

    public Asignatura(String nombre, int horasSemanales){
        this.nombre = nombre;
        this.horasSemanales = horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public void matricularAlumno(Alumno alumno){
        if(!alumnos.contains(alumno)){
            alumnos.add(alumno);
        }
    }
}
