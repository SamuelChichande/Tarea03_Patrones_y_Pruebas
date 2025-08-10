package Patron_Decorator;

public abstract class TicketDecorator implements TicketComponent {
    protected TicketComponent ticket;

    public TicketDecorator(TicketComponent ticket) {
        this.ticket = ticket;
    }

    public abstract TicketDecorator agregarOpcion(TicketComponent ticket);

}
