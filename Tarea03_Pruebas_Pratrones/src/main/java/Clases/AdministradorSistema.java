/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Patron_Observer.Funcion;
import Patron_Singlenton.GestorEventos;
import Patron_Singlenton.GestorFunciones;
import Patron_Singlenton.GestorPoliticaCancelacion;
import java.util.List;

/**
 *
 * @author Schic
 */
public class AdministradorSistema extends Usuario {

    public AdministradorSistema(String nombre, String email) {
        super(nombre, email);
    }

    public Evento crearEvento(String titulo, String descripcion) {
        int numero = (int) (Math.random() * 3) + 1;
        if (numero == 1) {
            return new EventoTeatro(titulo, descripcion);
        } else if (numero == 2) {
            return new EventoStandUp(titulo, descripcion);
        } else {
            return new EventoMicroTeatro(titulo, descripcion);
        }
    }

    public Evento modificarEvento(Evento evento) {
        GestorEventos ge = GestorEventos.getInstance();
        List<Evento> listEventos = ge.getEventos();
        for (int i = 0; i < listEventos.size(); i++) {
            if (listEventos.get(i).getTitulo().equals(evento.getTitulo())) {
                ge.getEventos().get(i).setDescripcion(evento.getDescripcion());
                return evento;
            }
        }
        return null;
    }

    public Funcion configurarFuncion(Funcion funcion) {
        GestorFunciones gf = GestorFunciones.getInstance();
        for (Funcion f : gf.getFunciones()) {
            if (f.getId() == funcion.getId()) {
                f.reprogramar(funcion.getFechaHora(), funcion.getUbicacion());
                System.out.println("La ubicacion ha sido confugurada con exito");
                return funcion;
            }
        }
        return null;
    }

    public Promocion definirPromocion(String descripcion, float descuento) {
        return new Promocion(descripcion, descuento);
    }

    public void configurarPoliticaCancelamiento(PoliticaCancelacion politicaCancelacion) {
        GestorPoliticaCancelacion gpc = GestorPoliticaCancelacion.getInstance();
        gpc.agregarPoliticaCancelacion(politicaCancelacion);
    }

}
