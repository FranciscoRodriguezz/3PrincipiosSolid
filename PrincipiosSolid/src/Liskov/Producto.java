package Liskov;

import java.util.ArrayList;
import java.util.List;

class Producto {
    private String nombre;
    private double precio;
    private int cantidadDisponible;
    private List<Producto> carrito; // Lista de productos en el carrito

    public Producto(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
        this.carrito = new ArrayList<>();
    }

    public void agregarAlCarrito() {
        if (cantidadDisponible > 0) {
            carrito.add(this);
            cantidadDisponible--;
            System.out.println(nombre + " agregado al carrito.");
        } else {
            System.out.println("No hay suficientes unidades disponibles de " + nombre + ".");
        }
    }

    public double calcularDescuento() {
        // Aplica descuentos según la cantidad disponible
        if (cantidadDisponible >= 10) {
            return precio * 0.1; // 10% de descuento
        } else if (cantidadDisponible >= 5) {
            return precio * 0.2; // 20% de descuento
        } else {
            return precio * 0.3; // 30% de descuento
        }
    }

    // Otros métodos y atributos comunes a todos los productos
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    // Método para obtener el contenido del carrito
    public List<Producto> getCarrito() {
        return carrito;
    }
}
