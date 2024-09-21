package com.teatro;

public interface BoletoFactory {
	Boleto crearBoleto(String asiento, double precio);
}
