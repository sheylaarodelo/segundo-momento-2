package com.example;

public class revista extends material {
    private int numeroEdicion;
    private String mesPublicacion;

    public revista(String titulo, String autor, int añoPublicacion, int numeroEdicion, String mesPublicacion) {
        super(titulo, autor, añoPublicacion);
        this.numeroEdicion = numeroEdicion;
        this.mesPublicacion = mesPublicacion;
    }

    @Override
    public String getTipoMaterial() {
        return "Revista";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 0.5;
        return tarifaBase * diasPrestamo;
    }

    public void mostrarDetallesRevista() {
        mostrarInformacion();
        System.out.println("Número de Edición: " + numeroEdicion);
        System.out.println("Mes de Publicación: " + mesPublicacion);
    }
}