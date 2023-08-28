package SegregacionDeInterfaces;

// Implementación de una clase de revista
class RevistaImpl implements Revista {
    private String editorial;
    private int numero;
    private String informacion;

    public RevistaImpl(String editorial, int numero, String informacion) {
        this.editorial = editorial;
        this.numero = numero;
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
    public String obtenerEditorial() {
        return editorial;
    }

    @Override
    public int obtenerNumero() {
        return numero;
    }
}
