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

    public Producto(String nombre, double precio, double porcentajeIVA,
            double porcentajeDescuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.porcentajeIVA = porcentajeIVA;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double calcularIVADelProducto() throws Exception {
        if (porcentajeIVA < 0) {
            throw new Exception("El porcentaje no puede ser menor a cero");
        }
        return (precio * porcentajeIVA) / 100;
    }

    public double calcularDescuentoDelProducto() throws Exception {
        if (porcentajeDescuento < 0) {
            throw new Exception("El porcentaje no puede ser menor a cero");
        }
        return (precio * porcentajeDescuento) / 100;
    }
}
