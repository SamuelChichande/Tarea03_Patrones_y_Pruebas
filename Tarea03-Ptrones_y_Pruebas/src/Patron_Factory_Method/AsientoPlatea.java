package Patron_Factory_Method;

import clases.Usuario;

public class AsientoPlatea extends Asiento {

    public AsientoPlatea(Usuario reservadoPor, float precio, String descripcion) {
        super(reservadoPor, precio, descripcion);
    }

}
