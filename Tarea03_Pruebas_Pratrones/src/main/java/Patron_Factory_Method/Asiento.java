/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Factory_Method;

import Clases.Usuario;

/**
 *
 * @author Schic
 */
public abstract class Asiento {
    protected Usuario reservadoPor;
    protected double precio;
    protected String descripcion;

    public Asiento(Usuario reservadoPor, String descripcion) {
        this.reservadoPor = reservadoPor;
        this.descripcion = descripcion;
    }

    public Usuario getReservadoPor() {
        return reservadoPor;
    }

    public void setReservadoPor(Usuario reservadoPor) {
        this.reservadoPor = reservadoPor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
