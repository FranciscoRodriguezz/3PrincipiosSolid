package SegregacionDeInterfaces;

// Implementación de una clase de libro
class LibroImpl implements Libro {
    private String autor;
    private String isbn;
    private String informacion;

    public LibroImpl(String autor, String isbn, String informacion) {
        this.autor = autor;
        this.isbn = isbn;
        this.informacion = informacion;
    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public String obtenerInformacion() {
        return informacion;
    }

    @Override
    public String obtenerAutor() {
        return autor;
    }

    @Override
    public String obtenerISBN() {
        return isbn;
    }
}
