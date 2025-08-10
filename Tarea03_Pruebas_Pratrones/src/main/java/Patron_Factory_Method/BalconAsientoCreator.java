/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Factory_Method;

/**
 *
 * @author Schic
 */
public class BalconAsientoCreator extends AsientoCreator {

    public BalconAsientoCreator(Asiento asiento) {
        super(asiento);
    }

    @Override
    public Asiento crearAsiento() {
        return new AsientoPlatea(getAsiento().getReservadoPor(), getAsiento().getDescripcion());
    }

}
