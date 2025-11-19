package fotoexpress;

public class Camara extends Producto {
    private String marca;
    private String modelo;
    private String descripcion;

    public Camara(int numero, String marca, String modelo, double precio, String descripcion) {
        super(numero, precio);
        this.marca = marca;
        this.modelo = modelo;
        this.descripcion = descripcion;
    }

    @Override
    public String getDescripcion() {
        return "Cámara " + marca + " " + modelo + " - " + descripcion;
    }
}
