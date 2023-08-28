package SegregacionDeInterfaces;

public class Main {
    public static void main(String[] args) {

        Libro libro = new LibroImpl("Marques de sade", "123456789", "120 dias de sodoma");
        Revista revista = new RevistaImpl("Editorial Norma", 1, "La filosofía en el tocador");
        AudioLibro audioLibro = new AudioLibroImpl("Narrador A", 120, "La nueva Justine o las desgracias de la virtud");


        libro.prestar();
        revista.prestar();
        audioLibro.prestar();

        libro.devolver();
        revista.devolver();
        audioLibro.devolver();


        System.out.println("Información del libro: " + libro.obtenerInformacion());
        System.out.println("Autor del libro: " + libro.obtenerAutor());
        System.out.println("ISBN del libro: " + libro.obtenerISBN());

        System.out.println("Información de la revista: " + revista.obtenerInformacion());
        System.out.println("Editorial de la revista: " + revista.obtenerEditorial());
        System.out.println("Número de la revista: " + revista.obtenerNumero());

        System.out.println("Información del audiolibro: " + audioLibro.obtenerInformacion());
        System.out.println("Narrador del audiolibro: " + audioLibro.obtenerNarrador());
        System.out.println("Duración del audiolibro: " + audioLibro.obtenerDuracion() + " minutos");
    }
}




