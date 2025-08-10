/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Decorator;

import Clases.Usuario;
import Patron_Factory_Method.Asiento;
import Patron_Observer.Funcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
public class BasicTicket implements TicketComponent {
    private double precioBase;
    private String detalles;
    private List<Asiento> asientos;
    private Funcion funcion;
    private Usuario usuario;

    public BasicTicket(Funcion funcion, Usuario usuario) {
        this.precioBase = 5;
        this.funcion = funcion;
        this.usuario = usuario;
        this.asientos = new ArrayList<>();
    }

    @Override
    public double precio() {
        System.out.println("El precio de un ticket sin complementos es de: $5.00");
        return 5;
    }

    @Override
    public String descripcion() {
        return "Ticket [Precio=" + precioBase + ", funcion=" + funcion + ", usuario=" + usuario + "]";
    }

    // Getter y Setters
    public double getPrecioBase() {
        return precioBase;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
