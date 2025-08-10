/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Observer;

import Clases.Evento;
import Patron_Factory_Method.Asiento;
import Patron_Singlenton.GestorFunciones;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
public class Funcion {
    private int id;
    private Evento evento;
    private LocalDateTime fechaHora;
    private String ubicacion;
    private List<Asiento> asientos;
    private NotificacionManager notificaciones;

    public Funcion(int id, Evento evento, LocalDateTime fechaHora, String ubicacion) {
        this.evento = evento;
        this.id = id;
        this.fechaHora = fechaHora;
        this.ubicacion = ubicacion;
        this.notificaciones = new NotificacionManager(this);
    }

    public List<Asiento> getAsientosDisponibles() {
        List<Asiento> asientoDisponibles = new ArrayList<>();
        for (Asiento asiento : getAsientos()) {
            if (asiento.getReservadoPor() == null) {
                asientoDisponibles.add(asiento);
            }
        }
        return asientoDisponibles;
    }

    public void reprogramar(LocalDateTime fechaHora, String ubicacion) {
        if (fechaHora != null) {
            setFechaHora(fechaHora);
            notificaciones.notificarSuscriptores();
        }

        if (!ubicacion.isEmpty() && ubicacion != null) {
            setUbicacion(ubicacion);
            notificaciones.notificarSuscriptores();
        }
        System.out.println("La funcion ha sido reprogramada");
    }

    public void cancelar() {
        GestorFunciones gf = GestorFunciones.getInstance();
        List<Funcion> listFunciones = gf.getFunciones();
        for (int i = 0; i < listFunciones.size(); i++) {
            if (listFunciones.get(i).equals(this)) {
                listFunciones.remove(i);
                System.out.println("La funcion ha sido cancelada exitosamente");
                notificaciones.notificarSuscriptores();
                break;
            }
        }
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

}

