package fotoexpress;

public abstract class Producto {
    protected int numero;
    protected double precio;

    public Producto(int numero, double precio) {
        this.numero = numero;
        this.precio = precio;
    }

    public double getPrecio() { return precio; }

    public abstract String getDescripcion();
}
