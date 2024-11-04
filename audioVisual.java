package com.example;

public class audioVisual extends material {
    private String formato;
    private int duracion;

    public audioVisual(String titulo, String autor, int añoPublicacion, String formato, int duracion) {
        super(titulo, autor, añoPublicacion);
        this.formato = formato;
        this.duracion = duracion;
    }

    @Override
    public String getTipoMaterial() {
        return "Audiovisual";
    }

    @Override
    public double calcularTarifaPrestamo(int diasPrestamo) {
        double tarifaBase = 1.5; // tarifa base por día
        if (formato.equalsIgnoreCase("Blu-ray")) {
            tarifaBase += 1.0; // recargo si es Blu-ray
        }
        return tarifaBase * diasPrestamo;
    }

    public void mostrarDetallesAudiovisual() {
        mostrarInformacion();
        System.out.println("Formato: " + formato);
        System.out.println("Duración: " + duracion + " minutos");
    }
}
