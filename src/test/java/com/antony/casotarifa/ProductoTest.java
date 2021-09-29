package com.antony.casotarifa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Antony
 */
public class ProductoTest {

    static Producto producto;

    @BeforeAll
    public static void beforeAll() {
        producto = new Producto("Calculadora", 50000);
    }

    @Test
    public void testProductoCalcularIVA() {
        producto.setPorcentajeIVA(19);
        assertEquals(9500, producto.calcularIVADelProducto(), 0.0);
    }

    @Test
    public void testProductoCalcularIVADebeLanzarIllegalArgumentExceptionSiElProcentajeEsMayorACien() {
        producto.setPorcentajeIVA(110);
        assertThrows(IllegalArgumentException.class, () -> {
            producto.calcularIVADelProducto();
        });
    }

    @Test
    public void testProductoCalcularIVADebeLanzarIllegalArgumentExceptionSiElProcentajeEsMenorACero() {
        producto.setPorcentajeIVA(-12);
        assertThrows(IllegalArgumentException.class, () -> {
            producto.calcularIVADelProducto();
        });
    }

    @Test
    public void testProductoCalcularDescuento() {
        producto.setPorcentajeDescuento(5);
        assertEquals(2500, producto.calcularDescuentoDelProducto(), 0.0);
    }

    @Test
    public void testProductoCalcularDescuentoDebeLanzarIllegalArgumentExceptionSiElProcentajeEsMayorACien() {
        producto.setPorcentajeDescuento(200);
        assertThrows(IllegalArgumentException.class, () -> {
            producto.calcularDescuentoDelProducto();
        });
    }

    @Test
    public void testProductoCalcularDescuentoDebeLanzarIllegalArgumentExceptionSiElProcentajeEsMenorACero() {
        producto.setPorcentajeDescuento(-7);
        assertThrows(IllegalArgumentException.class, () -> {
            producto.calcularDescuentoDelProducto();
        });
    }

    @Test
    public void testProductoCalcularTarifa() {
        assertEquals(62000, producto.calcularTarifa(), 0.0);
    }
}
