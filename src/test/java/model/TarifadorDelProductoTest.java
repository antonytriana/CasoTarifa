/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import excepciones.PorcentajeIncorrectoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Antony
 */
public class TarifadorDelProductoTest {

    static Producto producto;
    static CalculadorDelProducto productoConDescuentoIVA;

    @BeforeAll
    public static void beforeAll() {
        producto = new Producto.ProductoBuilder().conNombre("Calculadora")
                .conPrecio(50000).conIVA(19).conDescuento(5).build();
        productoConDescuentoIVA = new CalculadorDelProducto(producto);
    }

    @Test
    public void testProductoCalcularTarifa() throws PorcentajeIncorrectoException {
        assertEquals(62000, new TarifadorDelProducto(productoConDescuentoIVA)
                .calcularTarifaDelProducto(), 0.0);
    }
}
