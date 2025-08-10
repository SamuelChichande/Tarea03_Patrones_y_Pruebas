/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Patron_Decorator.TicketComponent;
import Patron_Factory_Method.Asiento;
import Patron_Observer.Funcion;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Schic
 */
public class Reservacion {
    private Usuario usuario;
    private Funcion funcion;
    private List<Asiento> asientos;
    private LocalDate fechaExpiracion;

    public Reservacion(Usuario usuario, Funcion funcion, List<Asiento> asientos, LocalDate fechaExpiracion) {
        this.funcion = funcion;
        this.usuario = usuario;
        this.asientos = asientos;
        this.fechaExpiracion = fechaExpiracion;
    }

    public boolean confirmarCompra(TicketComponent ticket) {
        Random random = new Random();
        double num = random.nextDouble();
        if (num > 0.7) {
            return true;
        } else {
            librar();
            return false;
        }
    }

    public void librar() {
        System.out.println("Ha ocurrido un error en su compra, por ende su ticket se ha liberado");
    }

    // Getters y setters
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public List<Asiento> getAsientos() {
        return asientos;
    }

    public void setAsientos(List<Asiento> asientos) {
        this.asientos = asientos;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

}
