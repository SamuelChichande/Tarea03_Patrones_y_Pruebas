package Patron_Observer;

import java.util.ArrayList;
import java.util.List;

import Patron_Factory_Method.Asiento;

public class NotificacionManager {
    private Funcion funcion;
    private List<NotificacionListener> suscriptores;

    public NotificacionManager(Funcion funcion) {
        this.funcion = funcion;
        this.suscriptores = new ArrayList<>();
    }

    public void suscribir(NotificacionListener subscriber) {
        suscriptores.add(subscriber);
    }

    public void desuscribir(NotificacionListener subscriber) {
        for (int i = 0; i < suscriptores.size(); i++) {
            if (suscriptores.get(i).equals(subscriber)) {
                suscriptores.remove(i);
            }
        }
    }

    public void notificarSuscriptores() {
        List<Asiento> listAsiento = funcion.getAsientos();
        for (Asiento asiento : listAsiento) {
            if (asiento.getReservadoPor() != null) {
                NotificacionEmail ne = new NotificacionEmail();
                NotificacionSMS nSMS = new NotificacionSMS();
                ne.actualizar();
                nSMS.actualizar();
            }
        }
    }
}
