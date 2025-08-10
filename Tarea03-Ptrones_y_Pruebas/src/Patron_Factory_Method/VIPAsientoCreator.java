package Patron_Factory_Method;

public class VIPAsientoCreator extends AsientoCreator {

    public VIPAsientoCreator(Asiento asiento) {
        super(asiento);
    }

    @Override
    public Asiento crearAsiento() {
        return new AsientoVIP(getAsiento().getReservadoPor(), getAsiento().getPrecio(), getAsiento().getDescripcion());
    }

}
