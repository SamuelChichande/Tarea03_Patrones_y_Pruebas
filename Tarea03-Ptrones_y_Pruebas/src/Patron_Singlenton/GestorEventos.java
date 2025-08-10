package Patron_Singlenton;

import java.util.ArrayList;
import java.util.List;

import clases.Evento;

public class GestorEventos {
    private static GestorEventos instance;
    private List<Evento> eventos;

    private GestorEventos() {
        eventos = new ArrayList<>();
    }

    public static synchronized GestorEventos getInstance() {
        if (instance == null) {
            instance = new GestorEventos();
        }
        return instance;
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public List<Evento> getEventos() {
        return new ArrayList<>(eventos);
    }
}
