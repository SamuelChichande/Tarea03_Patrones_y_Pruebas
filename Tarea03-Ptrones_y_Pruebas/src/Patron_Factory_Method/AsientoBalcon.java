package Patron_Factory_Method;

import clases.Usuario;

public class AsientoBalcon extends Asiento {

    public AsientoBalcon(Usuario reservadoPor, float precio, String descripcion) {
        super(reservadoPor, precio, descripcion);
    }

}
