package Liskov;

class Libro extends Producto {
    private String autor;

    public Libro(String nombre, double precio, int cantidadDisponible, String autor) {
        super(nombre, precio, cantidadDisponible);
        this.autor = autor;
    }

    public String obtenerAutor() {
        return autor;
    }
}
