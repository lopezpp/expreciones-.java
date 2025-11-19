package fotoexpress;

public class Empleado {
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(int idEmpleado, String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nombre + " - " + cargo + " ($" + salario + ")";
    }
}
