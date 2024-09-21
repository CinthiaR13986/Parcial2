package com.teatro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ControlVentas {
    private HashMap<String, List<Venta>> ventasPorHorario;

    public ControlVentas() {
        ventasPorHorario = new HashMap<>();
    }

    // Agregar una venta al control
    public void registrarVenta(Venta venta) {
        String horario = venta.getHorario();
        if (!ventasPorHorario.containsKey(horario)) {
            ventasPorHorario.put(horario, new ArrayList<>());
        }
        ventasPorHorario.get(horario).add(venta);
    }

    // Mostrar las ventas por horario
    public void mostrarVentasPorHorario(String horario) {
        if (ventasPorHorario.containsKey(horario)) {
            List<Venta> ventas = ventasPorHorario.get(horario);
            System.out.println("Ventas para el horario: " + horario);
            for (Venta venta : ventas) {
                venta.mostrarInfoVenta();
            }
        } else {
            System.out.println("No hay ventas para el horario: " + horario);
        }
    }

    // Obtener el número de ventas para un horario específico
    public int obtenerNumeroVentas(String horario) {
        if (ventasPorHorario.containsKey(horario)) {
            return ventasPorHorario.get(horario).size();
        }
        return 0;
    }
}
