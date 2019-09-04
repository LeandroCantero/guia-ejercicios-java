package Ejercicio33;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private String email;
    private Set<Asignatura> asignaturas = new HashSet<>(); //Conjuntos

    public Alumno(String nombre, String apellido, String email){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public Set<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void matricular(Asignatura asignatura){
        if(!asignaturas.contains(asignatura)) {
            asignaturas.add(asignatura);
            asignatura.matricularAlumno(this);
        }
    }

    public int horasTotales(){
        return asignaturas.stream()
                .mapToInt(a -> a.getHorasSemanales())
                .sum();
    }
}
