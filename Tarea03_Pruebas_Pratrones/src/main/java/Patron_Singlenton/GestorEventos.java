/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Singlenton;

import Clases.Evento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
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
