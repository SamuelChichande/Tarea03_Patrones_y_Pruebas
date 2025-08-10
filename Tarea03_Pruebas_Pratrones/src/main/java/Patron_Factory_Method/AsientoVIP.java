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
public class AsientoVIP extends Asiento {

    public AsientoVIP(Usuario reservadoPor, String descripcion) {
        super(reservadoPor, descripcion);
        this.precio = 6;
    }

}
