package Patron_Factory_Method;

import clases.Usuario;

public abstract class AsientoCreator {
    protected Asiento asiento;

    public AsientoCreator(Asiento asiento) {
        this.asiento = asiento;
    }

    public abstract Asiento crearAsiento();

    public Asiento vender(Usuario usuario) {
        Asiento a = getAsiento();
        a.setReservadoPor(usuario);
        System.out.println("El asiento ha sido vendido a: " + usuario.getNombre());
        return a;
    };

    public Asiento getAsiento() {
        return asiento;
    }

    public void setAsiento(Asiento asiento) {
        this.asiento = asiento;
    }

}
