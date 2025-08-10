/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Observer;

import Patron_Factory_Method.Asiento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
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

