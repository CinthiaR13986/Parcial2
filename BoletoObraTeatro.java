package com.teatro;

public class BoletoObraTeatro extends Boleto {
    public BoletoObraTeatro(String asiento, double precio) {
        this.asiento = asiento;
        this.precio = precio;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Boleto para obra de teatro, asiento: " + asiento + ", precio: " + precio);
    }
}
