package model;

import java.time.LocalDate;

/**
 * Clase cliente para el Caso Tarifa.
 *
 * @author Antony Triana <antonytriana@gmail.com>
 * @version 1.0
 * @since 2021
 */
public class Cliente extends Persona implements ClienteCrud {

    private String identificacionDelCliente;

    public Cliente(String identificacionDelCliente, String identificacion,
            String nombre, String apellido,
            LocalDate fechaNacimiento) throws Exception {
        super(identificacion, nombre, apellido, fechaNacimiento);
        setIdentificacionDelCliente(identificacionDelCliente);
    }

    @Override
    public void insertar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void actualizar() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setIdentificacionDelCliente(String identificacionDelCliente) {
        this.identificacionDelCliente = identificacionDelCliente;
    }

}
