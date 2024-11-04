package com.example;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<material> materiales;

    public Biblioteca() {
        materiales = new ArrayList<>();
    }

    public void agregarMaterial(material material) {
        materiales.add(material);
    }

    public material buscarMaterial(String titulo) {
        for (material material : materiales) {
            if (material.toString().equalsIgnoreCase(titulo)) {
                return material;
            }
        }
        return null;
    }

    public void mostrarCatalogo() {
        for (material material : materiales) {
            System.out.println(material);
        }
    }
}
