package com.teatro;

public class Main {
    public static void main(String[] args) {
        // Usando la Abstract Factory para una obra de teatro
        TeatroAbstractFactory teatroFactory = new TeatroFactory();
        Obra obraTeatro = teatroFactory.crearObra("Romeo y Julieta", "20:00");
        BoletoFactory boletoTeatroFactory = teatroFactory.crearBoletoFactory();
        Boleto boletoTeatro = boletoTeatroFactory.crearBoleto("A12", 50.0);

        obraTeatro.mostrarInfo();
        boletoTeatro.mostrarInfo();
    }
}
