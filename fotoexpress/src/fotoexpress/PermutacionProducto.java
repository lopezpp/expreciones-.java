package fotoexpress;

import java.util.*;

public class PermutacionProducto {
    private Map<String, Producto> combinaciones = new HashMap<>();
    private double valorTotal;

    public void addCombinacion(String clave, Producto p) {
        combinaciones.put(clave, p);
        calcularValorTotal();
    }

    private void calcularValorTotal() {
        valorTotal = 0;
        for (Producto p : combinaciones.values()) valorTotal += p.getPrecio();
    }

    public double getValorTotal() { return valorTotal; }
}
