package model;

import java.time.LocalDate;

/**
 * Clase Persona para el Caso Tarifa.
 *
 * @author Antony Triana <antonytriana@gmail.com>
 * @version 1.0
 * @since 2021
 */
public abstract class Persona {

    private String identificacion;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;

    /**
     * Constructor para instanciar el objeto vacio.
     */
    public Persona() {
    }

    /**
     * Constructor para instanciar por defecto los datos de la clase.
     *
     * @param identificacion Nueva identificacion.
     * @param nombre Nuevo nombre.
     * @param apellido Nuevo apellido.
     * @param fechaNacimiento Nueva fecha de nacimiento.
     * @throws java.lang.Exception Se lanza excepcion cuando la identficacion
     * esta vacia o tiene menos de 8 caracteres.
     */
    public Persona(String identificacion, String nombre, String apellido,
            LocalDate fechaNacimiento) throws Exception {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setApellido(apellido);
        setFechaNacimiento(fechaNacimiento);
    }

    /**
     * Devuelve la identificacion de la Persona.
     *
     * @return Un String que representa la identificacion de la Persona.
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Modifica la identificacion de la Persona.
     *
     * @param identificacion Nueva identificacion.
     * @throws java.lang.Exception 1. La identificacion sea nula. 2. La
     * identificacion no tiene minimo 8 caracteres.
     */
    public void setIdentificacion(String identificacion) throws Exception {
        if (identificacion == null) {
            throw new Exception("La identificacion no puede ser nula.");
        }
        if (identificacion.length() <= 7) {
            throw new Exception("La identificacion debe tener minimo 8"
                    + " caracteres.");
        }
        if (!identificacion.matches("[0-9]+")) {
            throw new Exception("La identificacion solo debe contener numeros");
        }
        this.identificacion = identificacion;
    }

    /**
     * Devuelve el nombre de la Persona.
     *
     * @return Un String que representa el nombre de la Persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la Persona.
     *
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el apellido dde la Persona.
     *
     * @return Un String que representa el apellido de la Persona.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Modifica el apellido de la Persona.
     *
     * @param apellido Nuevo apellido.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Devuelve la fecha de nacimiento de la Persona.
     *
     * @return Un dato que representa la fecha de nacimiento de la Persona, de
     * la forma AAAA/MM/DD
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Modifica la fecha de nacimiento de la Persona.
     *
     * @param fechaNacimiento Nueva fecha de nacimiento.
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return String.format("%1$12S %2$-12S %3$-12S %4$S",
                identificacion, nombre, apellido, fechaNacimiento);
    }
}
