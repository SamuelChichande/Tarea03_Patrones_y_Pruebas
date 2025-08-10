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
public class AsientoBalcon extends Asiento {

    public AsientoBalcon(Usuario reservadoPor, String descripcion) {
        super(reservadoPor, descripcion);
        this.precio = 4;
    }

}
