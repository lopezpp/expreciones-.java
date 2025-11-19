package fotoexpress;

public class Promocion {
    private String nombre;
    private double descuento;

    public Promocion(String nombre, double descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public double aplicarDescuento(double total) {
        return total - (total * descuento / 100);
    }

    @Override
    public String toString() {
        return nombre + " (" + descuento + "% OFF)";
    }
}
