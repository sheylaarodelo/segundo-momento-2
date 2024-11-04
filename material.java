package com.example;

public abstract class material {
    protected String titulo;
    protected String autor;
    protected int añoPublicacion;
    protected boolean disponible;

    public material(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.disponible = true;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicación: " + añoPublicacion);
        System.out.println("Disponible: " + (disponible + "Sí o No"));
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("Material prestado: " + titulo);
        } else {
            System.out.println("Material ya esta prestado.");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("Material devuelto: " + titulo);
    }

    public abstract String getTipoMaterial();
    public abstract double calcularTarifaPrestamo(int diasPrestamo);
}
