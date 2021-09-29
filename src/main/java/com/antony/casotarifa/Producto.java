/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antony.casotarifa;

/**
 *
 * @author Antony
 */
public class Producto {

    String nombre;
    double precio;
    double porcentajeIVA;
    double porcentajeDescuento;
    double IVA;
    double descuento;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double calcularIVADelProducto() {
        if (porcentajeIVA < 0 || porcentajeIVA > 100) {
            throw new IllegalArgumentException("El porcentaje no puede ser "
                    + "menor a cero");
        }
        return (precio * porcentajeIVA) / 100;
    }

    public double calcularDescuentoDelProducto() {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new IllegalArgumentException("El porcentaje no puede ser "
                    + "menor a cero");
        }
        descuento = (precio * porcentajeDescuento) / 100;
        return descuento;
    }

    public void setPorcentajeIVA(double porcentajeIVA) {
        this.porcentajeIVA = porcentajeIVA;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
