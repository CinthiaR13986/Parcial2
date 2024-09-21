package com.teatro;

public class MainC {
    public static void main(String[] args) {
        // Usando la Abstract Factory para una obra de teatro
        TeatroAbstractFactory teatroFactory = new TeatroFactory();
        Obra obraTeatro = teatroFactory.crearObra("Hamlet", "19:00");
        BoletoFactory boletoTeatroFactory = teatroFactory.crearBoletoFactory();
        Boleto boletoTeatro = boletoTeatroFactory.crearBoleto("A12", 50.0);

        // Crear el controlador de ventas
        ControlVentas controlVentas = new ControlVentas();

        // Registrar algunas ventas
        Venta venta1 = new Venta(obraTeatro, boletoTeatro, "19:00");
        Venta venta3 = new Venta(obraTeatro, boletoTeatro, "19:00");

        controlVentas.registrarVenta(venta1);
     
        controlVentas.registrarVenta(venta3);

        // Mostrar ventas por horario
        controlVentas.mostrarVentasPorHorario("19:00");
        controlVentas.mostrarVentasPorHorario("21:00");

        // Obtener el número de ventas para un horario específico
        System.out.println("Número de ventas para el horario 19:00: " + controlVentas.obtenerNumeroVentas("19:00"));
    }
}
