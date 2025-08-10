package Patron_Factory_Method;

public class PlateaAsientoCreator extends AsientoCreator {

    public PlateaAsientoCreator(Asiento asiento) {
        super(asiento);
    }

    @Override
    public Asiento crearAsiento() {
        return new AsientoBalcon(getAsiento().getReservadoPor(), getAsiento().getPrecio(),
                getAsiento().getDescripcion());
    }

}
