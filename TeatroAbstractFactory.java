package com.teatro;

public interface TeatroAbstractFactory {
    BoletoFactory crearBoletoFactory();
    Obra crearObra(String titulo, String horario);
}
