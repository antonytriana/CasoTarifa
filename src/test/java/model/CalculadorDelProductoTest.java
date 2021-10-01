package model;

import excepciones.PorcentajeIncorrectoException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Antony
 */
public class CalculadorDelProductoTest {

    static Producto producto;

    @BeforeAll
    public static void beforeAll() {
        producto = new Producto.ProductoBuilder().conNombre("Calculadora")
                .conPrecio(50000).build();
    }

    @Test
    public void testProductoCalcularIVA() throws PorcentajeIncorrectoException {
        producto.setIVA(19);
        assertEquals(9500, new CalculadorDelProducto(producto)
                .calcularIVADelProducto(), 0.0);
    }

    @Test
    public void testProductoCalcularIVADebeLanzarPorcentajeIncorrectoExceptionSiElProcentajeEsMayorACien() {
        assertThrows(PorcentajeIncorrectoException.class, () -> {
            new CalculadorDelProducto(producto).calcularIVADelProducto();
        });
    }

    @Test
    public void testProductoCalcularIVADebeLanzarPorcentajeIncorrectoExceptionSiElProcentajeEsMenorACero() {
        producto.setIVA(-12);
        assertThrows(PorcentajeIncorrectoException.class, () -> {
            new CalculadorDelProducto(producto).calcularIVADelProducto();
        });
    }

    @Test
    public void testProductoCalcularDescuento() throws PorcentajeIncorrectoException {
        producto.setDescuento(5);
        assertEquals(2500, new CalculadorDelProducto(producto)
                .calcularDescuentoDelProducto(), 0.0);
    }

    @Test
    public void testProductoCalcularDescuentoDebeLanzarPorcentajeIncorrectoExceptionSiElProcentajeEsMayorACien() {
        producto.setDescuento(200);
        assertThrows(PorcentajeIncorrectoException.class, () -> {
            new CalculadorDelProducto(producto).calcularDescuentoDelProducto();
        });
    }

    @Test
    public void testProductoCalcularDescuentoDebeLanzarPorcentajeIncorrectoExceptionSiElProcentajeEsMenorACero() {
        producto.setDescuento(-7);
        assertThrows(PorcentajeIncorrectoException.class, () -> {
            new CalculadorDelProducto(producto).calcularDescuentoDelProducto();
        });
    }

}
