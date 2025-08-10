package Patron_Factory_Method;

import clases.Usuario;

public abstract class Asiento {
    protected Usuario reservadoPor;
    protected float precio;
    protected String descripcion;

    public Asiento(Usuario reservadoPor, float precio, String descripcion) {
        this.reservadoPor = reservadoPor;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Usuario getReservadoPor() {
        return reservadoPor;
    }

    public void setReservadoPor(Usuario reservadoPor) {
        this.reservadoPor = reservadoPor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
