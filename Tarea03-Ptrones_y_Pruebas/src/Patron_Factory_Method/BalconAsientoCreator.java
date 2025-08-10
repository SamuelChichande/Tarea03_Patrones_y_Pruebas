package Patron_Factory_Method;

public class BalconAsientoCreator extends AsientoCreator {

    public BalconAsientoCreator(Asiento asiento) {
        super(asiento);
    }

    @Override
    public Asiento crearAsiento() {
        return new AsientoPlatea(getAsiento().getReservadoPor(), getAsiento().getPrecio(),
                getAsiento().getDescripcion());
    }

}
