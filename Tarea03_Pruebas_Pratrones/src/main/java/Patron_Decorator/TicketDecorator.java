/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Decorator;

/**
 *
 * @author Schic
 */
public abstract class TicketDecorator implements TicketComponent {
    protected TicketComponent ticket;

    public TicketDecorator(TicketComponent ticket) {
        this.ticket = ticket;
    }

    public abstract TicketDecorator agregarOpcion(TicketComponent ticket);

}
