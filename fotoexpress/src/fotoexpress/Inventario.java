package fotoexpress;

import java.util.*;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        System.out.println("📦 Inventario actual:");
        for (Producto p : productos)
            System.out.println("- " + p.getDescripcion() + " | $" + p.getPrecio());
    }
}
