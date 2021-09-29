package model;

/**
 *
 * @author Antony
 */
public class Producto {
    private String nombre;
    private double precio;
    private double IVA;
    private double descuento;

    public Producto(String nombre, double precio, double IVA,
            double descuento) {
        setNombre(nombre);
        setPrecio(precio);
        setIVA(IVA);
        setDescuento(descuento);
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
