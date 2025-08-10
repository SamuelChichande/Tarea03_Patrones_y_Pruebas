package Patron_Decorator;

public class TicketBebida extends TicketDecorator {

    public TicketBebida(TicketComponent ticket) {
        super(ticket);
    }

    @Override
    public double precio() {
        System.out.println("El acompañamiento con bebida cuesta: " + 1.5);
        return ticket.precio() + 1.5;
    }

    @Override
    public String descripcion() {
        return "A su ticket se a añadido el acompañamiento de bebida";
    }

    @Override
    public TicketDecorator agregarOpcion(TicketComponent ticket) {
        return new TicketBebida(ticket);
    }

}
