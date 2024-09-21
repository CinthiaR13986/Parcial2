package com.teatro;

public class TeatroFactory implements TeatroAbstractFactory {
    @Override
    public BoletoFactory crearBoletoFactory() {
        return new BoletoObraTeatroFactory();
    }

    @Override
    public ObraTeatro crearObra(String titulo, String horario) {
        return new ObraTeatro(titulo, horario);
    }
}
