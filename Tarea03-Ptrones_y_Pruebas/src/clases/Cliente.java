package clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Patron_Decorator.BasicTicket;
import Patron_Decorator.TicketComponent;
import Patron_Factory_Method.Asiento;
import Patron_Observer.Funcion;
import Patron_Singlenton.GestorEventos;
import Patron_Singlenton.GestorFunciones;
import Patron_Singlenton.GestorIncidentes;

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

    public Reservacion reservarAsiento(Asiento asiento, Funcion funcion) {
        LocalDate hoy = LocalDate.now();
        LocalDate proximoMes = hoy.plusMonths(1);
        LocalDate fechaAjustada = hoy.withDayOfMonth(Math.min(hoy.getDayOfMonth(), proximoMes.lengthOfMonth()));
        List<Asiento> a = new ArrayList<>();
        a.add(asiento);

        return new Reservacion(asiento.getReservadoPor(), funcion, a, fechaAjustada);
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
