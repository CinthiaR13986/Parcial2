package com.teatro;

public class ObraTeatro extends Obra {
    public ObraTeatro(String titulo, String horario) {
        this.titulo = titulo;
        this.horario = horario;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Obra de teatro: " + titulo + ", Horario: " + horario);
    }
}