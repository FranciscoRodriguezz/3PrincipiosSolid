package Liskov;

class Electronico extends Producto {
    private String marca;

    public Electronico(String nombre, double precio, int cantidadDisponible, String marca) {
        super(nombre, precio, cantidadDisponible);
        this.marca = marca;
    }

    public double calcularPrecio() {
        double descuento = calcularDescuento();
        return getPrecio() - descuento;
    }
}
