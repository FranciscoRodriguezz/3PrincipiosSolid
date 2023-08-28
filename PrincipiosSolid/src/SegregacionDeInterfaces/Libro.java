package SegregacionDeInterfaces;

// Interfaz para libros
interface Libro extends RecursoBibliotecario {
    String obtenerAutor();
    String obtenerISBN();
}
