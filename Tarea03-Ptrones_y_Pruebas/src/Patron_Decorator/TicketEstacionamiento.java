package Patron_Decorator;

public class TicketEstacionamiento extends TicketDecorator {

    public TicketEstacionamiento(TicketComponent ticket) {
        super(ticket);
    }

    @Override
    public double precio() {
        System.out.println("La opcion adicional de estacionamiento cuesta: " + 2.5);
        return ticket.precio() + 2.5;
    }

    @Override
    public String descripcion() {
        return "A su ticket se a añadido la opcion adicional de estacionamiento";
    }

    @Override
    public TicketDecorator agregarOpcion(TicketComponent ticket) {
        return new TicketEstacionamiento(ticket);
    }
}
