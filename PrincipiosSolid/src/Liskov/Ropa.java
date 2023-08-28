package Liskov;

import Liskov.Producto;

class Ropa extends Producto {
    private String talla;

    public Ropa(String nombre, double precio, int cantidadDisponible, String talla) {
        super(nombre, precio, cantidadDisponible);
        this.talla = talla;
    }

    public void mostrarTalla() {
        System.out.println("Talla: " + talla);
    }
}
