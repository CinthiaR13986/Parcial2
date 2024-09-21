package com.teatro;

public class BoletoObraTeatroFactory implements BoletoFactory {
    @Override
    public Boleto crearBoleto(String asiento, double precio) {
        return new BoletoObraTeatro(asiento, precio);
    }
}
