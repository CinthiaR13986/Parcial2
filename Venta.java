package com.teatro;

public class Venta {
    private Obra obra;
    private Boleto boleto;
    private String horario;

    public Venta(Obra obra, Boleto boleto, String horario) {
        this.obra = obra;
        this.boleto = boleto;
        this.horario = horario;
    }

    public void mostrarInfoVenta() {
        System.out.println("Venta de boleto: ");
        obra.mostrarInfo();
        System.out.println("Horario: " + horario);
        boleto.mostrarInfo();
    }

    public String getHorario() {
        return horario;
    }
}
