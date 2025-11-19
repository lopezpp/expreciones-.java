package fotoexpress;

import java.util.*;

public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private Date fecha;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.fecha = new Date();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.getPrecio();
        return total;
    }

    public void mostrarResumen() {
        System.out.println("\n🧾 Pedido de: " + cliente);
        for (Producto p : productos)
            System.out.println("- " + p.getDescripcion() + " | $" + p.getPrecio());
        System.out.println("💰 Total: $" + calcularTotal());
    }
}
