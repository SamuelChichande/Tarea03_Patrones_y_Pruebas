package clases;

import java.util.ArrayList;
import java.util.List;

import Patron_Observer.Funcion;

public abstract class Evento {
    protected String titulo;
    protected String descripcion;
    protected List<Funcion> funciones;

    public Evento(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.funciones = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }

    public abstract void agregarFuncion(String titulo, String descripcion);
}
