/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Patron_Decorator.BasicTicket;
import Patron_Decorator.TicketComponent;
import Patron_Factory_Method.Asiento;
import Patron_Observer.Funcion;
import Patron_Singlenton.GestorEventos;
import Patron_Singlenton.GestorFunciones;
import Patron_Singlenton.GestorIncidentes;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
public class Cliente extends Usuario {

    public Cliente(String nombre, String email) {
        super(nombre, email);
    }

    public List<Evento> verEventos() {
        GestorEventos ge = GestorEventos.getInstance();
        return ge.getEventos();
    }

    public Funcion seleccionarFuncion(int id) {
        GestorFunciones gf = GestorFunciones.getInstance();
        for (Funcion funcion : gf.getFunciones()) {
            if (funcion.getId() == id) {
                return funcion;
            }
        }
        return null;
    }

    public Reservacion reservarAsientos(List<Asiento> asientos, Funcion funcion) {
        if (asientos == null || asientos.isEmpty() || funcion ==  null) {
            return null;
        }
        LocalDate hoy = LocalDate.now();
        LocalDate proximoMes = hoy.plusMonths(1);
        LocalDate fechaAjustada = hoy.withDayOfMonth(Math.min(hoy.getDayOfMonth(), proximoMes.lengthOfMonth()));

        return new Reservacion(asientos.get(0).getReservadoPor(), funcion, asientos, fechaAjustada);
    }

    public TicketComponent comprarTicket(Reservacion reservacion) {
        return new BasicTicket(reservacion.getFuncion(), reservacion.getUsuario());
    }

    public void reportarIncidente(String descripcion) {
        GestorIncidentes gi = GestorIncidentes.getInstance();
        Incidente i = new Incidente(descripcion, "Pendiente", this);
        gi.agregarIncidente(i);
    }
}
