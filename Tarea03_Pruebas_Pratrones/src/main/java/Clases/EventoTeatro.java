/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Patron_Observer.Funcion;
import Patron_Singlenton.GestorFunciones;

/**
 *
 * @author Schic
 */
public class EventoTeatro extends Evento {

    public EventoTeatro(String titulo, String descripcion) {
        super(titulo, descripcion);
    }

    @Override
    public void agregarFuncion(String titulo, String descripcion) {
        GestorFunciones gf = GestorFunciones.getInstance();
        Evento e = new EventoTeatro(titulo, descripcion);
        Funcion f = gf.getFunciones().getLast();
        gf.agregarFuncion(new Funcion(f.getId() + 1, e, null, descripcion));
        System.out.println("La funcion fue creada exitosamente");
    }

}
