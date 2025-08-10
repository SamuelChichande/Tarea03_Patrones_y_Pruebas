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
public abstract class AsientoCreator {
    protected Asiento asiento;

    public AsientoCreator(Asiento asiento) {
        this.asiento = asiento;
    }

    public abstract Asiento crearAsiento();

    public Asiento vender(Usuario usuario) {
        Asiento a = getAsiento();
        a.setReservadoPor(usuario);
        System.out.println("El asiento ha sido vendido a: " + usuario.getNombre());
        return a;
    };

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

}
