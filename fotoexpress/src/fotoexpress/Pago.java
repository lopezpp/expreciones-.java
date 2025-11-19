package fotoexpress;

public class Pago {
    private String metodo;
    private double monto;

    public Pago(String metodo, double monto) {
        this.metodo = metodo;
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("💳 Pago de $" + monto + " realizado con " + metodo);
    }
}
