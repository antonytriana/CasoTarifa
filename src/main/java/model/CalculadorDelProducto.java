package model;

import excepciones.PorcentajeIncorrectoException;

/**
 *
 * @author Antony
 */
public class CalculadorDelProducto {

    protected Producto producto;

    public CalculadorDelProducto(Producto producto) {
        this.producto = producto;
    }

    public double calcularIVADelProducto() throws PorcentajeIncorrectoException {
        if (this.producto.getIVA() < 0 || this.producto.getIVA() > 100) {
            throw new PorcentajeIncorrectoException("El porcentaje no puede ser "
                    + "menor a cero y mayor a 100");
        }
        return (this.producto.getPrecio() * this.producto.getIVA()) / 100;
    }

    public double calcularDescuentoDelProducto() throws PorcentajeIncorrectoException {
        if (this.producto.getDescuento() < 0 || this.producto.getDescuento() > 100) {
            throw new PorcentajeIncorrectoException("El porcentaje no puede ser "
                    + "menor a cero y mayor a 100");
        }
        return (this.producto.getPrecio() * this.producto.getDescuento()) / 100;
    }
}
