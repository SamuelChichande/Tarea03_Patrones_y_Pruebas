/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Factory_Method;

/**
 *
 * @author Schic
 */
public class VIPAsientoCreator extends AsientoCreator {

    public VIPAsientoCreator(Asiento asiento) {
        super(asiento);
    }

    @Override
    public Asiento crearAsiento() {
        return new AsientoVIP(getAsiento().getReservadoPor(), getAsiento().getDescripcion());
    }

}
