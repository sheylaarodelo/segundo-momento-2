package com.example;

public class Main {
    public static void main(String[] args) {
        Biblioteca  biblioteca = new Biblioteca(); 

        libro libro1 = new libro("rosas", "sheyla", 1999, "978-3-16-148410-0", 400);
        revista revista1 = new revista("rcn", "Maria de las nieves", 2021, 123, "Enero");
        audioVisual audiovisual1 = new audioVisual("Rosas", "Sheyla",  2006, "Blu-ray", 250);

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);
        biblioteca.agregarMaterial(audiovisual1);

        System.out.println("Catálogo de la Biblioteca:");
        biblioteca.mostrarCatalogo();

       
        material buscado = biblioteca.buscarMaterial("Cien Años de Soledad");
        if (buscado != null) {
            System.out.println("Material encontrado:");
            buscado.mostrarInformacion();
        } else {
            System.out.println("Material no encontrado.");
        }

        
        libro1.prestar();
        libro1.devolver();
    }
}