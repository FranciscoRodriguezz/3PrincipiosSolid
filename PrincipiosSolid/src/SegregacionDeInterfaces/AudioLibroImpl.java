package SegregacionDeInterfaces;

// Implementación de una clase de audiolibro
class AudioLibroImpl implements AudioLibro {
    private String narrador;
    private int duracion;
    private String informacion;

    public AudioLibroImpl(String narrador, int duracion, String informacion) {
        this.narrador = narrador;
        this.duracion = duracion;
        this.informacion = informacion;
    }

    @Override
    public void prestar() {
        // Lógica para prestar un audiolibro
    }

    @Override
    public void devolver() {
        // Lógica para devolver un audiolibro
    }

    @Override
    public String obtenerInformacion() {
        return informacion;
    }

    @Override
    public String obtenerNarrador() {
        return narrador;
    }

    @Override
    public int obtenerDuracion() {
        return duracion;
    }
}
