package com.example;

public class libro extends material {
    private String isbn;
    private int numeroPaginas;

    public libro(String titulo, String autor, int añoPublicacion, String isbn, int numeroPaginas) {
        super(titulo, autor, añoPublicacion);
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String getTipoMaterial() {
        return "Libro";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 1.5;
        if (numeroPaginas > 500) {
            tarifaBase += 0.5;
        }
        return tarifaBase * diasPrestamo;
    }

    public void mostrarDetallesLibro() {
        mostrarInformacion();
        System.out.println("isbn: " + isbn);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }
}