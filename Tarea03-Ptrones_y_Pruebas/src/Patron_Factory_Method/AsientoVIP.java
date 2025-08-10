package Patron_Factory_Method;

import clases.Usuario;

public class AsientoVIP extends Asiento {

    public AsientoVIP(Usuario reservadoPor, float precio, String descripcion) {
        super(reservadoPor, precio, descripcion);
    }

}
