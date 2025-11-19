package fotoexpress;

public class Envio {
    private String direccion;
    private String tipo;
    private double costo;

    public Envio(String direccion, String tipo, double costo) {
        this.direccion = direccion;
        this.tipo = tipo;
        this.costo = costo;
    }

    public void realizarEnvio() {
        System.out.println("📦 Envío tipo " + tipo + " a " + direccion + " | Costo: $" + costo);
    }
}
