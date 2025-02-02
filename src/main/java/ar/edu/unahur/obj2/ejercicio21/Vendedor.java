package ar.edu.unahur.obj2.ejercicio21;

public class Vendedor extends Empleado{

    private float porcentaje;
    private float totalVenta;

    public Vendedor(String dni, String nombre, String apellido, String email, float sueldoBase, String legajo) {
        super(dni, nombre, apellido, email, sueldoBase, legajo);
        this.totalVenta = totalVenta;
        this.porcentaje = porcentaje;
    }

    public float getPorcentaje() {
        return porcentaje;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    @Override
    public float getSueldo() {
        return getSueldoBase()+(getPorcentaje()*totalVenta/100);
    }
}
