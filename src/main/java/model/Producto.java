package model;

/**
 * Clase Producto para el Caso Tarifa.
 *
 * @author Antony Triana <antonytriana@gmail.com>
 * @version 1.0
 * @since 2021
 */
public class Producto {

    private String nombre;
    private double precio;
    private double IVA;
    private double descuento;

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getIVA() {
        return IVA;
    }

    public double getDescuento() {
        return descuento;
    }

    public static class ProductoBuilder {

        private String nombre;
        private double precio;
        private double IVA;
        private double descuento;

        public ProductoBuilder() {
        }

        public ProductoBuilder conNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ProductoBuilder conPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public ProductoBuilder conIVA(double IVA) {
            this.IVA = IVA;
            return this;
        }

        public ProductoBuilder conDescuento(double descuento) {
            this.descuento = descuento;
            return this;
        }

        public Producto build() {
            Producto producto = new Producto();
            producto.nombre = this.nombre;
            producto.precio = this.precio;
            producto.IVA = this.IVA;
            producto.descuento = this.descuento;
            return producto;
        }
    }
}
