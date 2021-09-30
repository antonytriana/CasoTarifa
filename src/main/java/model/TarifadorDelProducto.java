package model;

import excepciones.PorcentajeIncorrectoException;

/**
 *
 * @author Antony
 */
public class TarifadorDelProducto {

    private CalculadorDelProducto productoConDescuentoIVA;

    public TarifadorDelProducto(CalculadorDelProducto producto) {
        this.productoConDescuentoIVA = producto;
    }

    public double calcularTarifaDelProducto() throws
            PorcentajeIncorrectoException {
        return this.productoConDescuentoIVA.producto.getPrecio()
                + this.productoConDescuentoIVA.calcularDescuentoDelProducto()
                + this.productoConDescuentoIVA.calcularIVADelProducto();
    }

}
