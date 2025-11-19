package fotoexpress;

public class Impresion extends Producto {
    private String color;
    private Foto foto;

    public Impresion(int numero, String color, Foto foto, double precio) {
        super(numero, precio);
        this.color = color;
        this.foto = foto;
    }

    @Override
    public String getDescripcion() {
        return "Impresión en " + color + " del archivo " + foto.getFichero();
    }
}
