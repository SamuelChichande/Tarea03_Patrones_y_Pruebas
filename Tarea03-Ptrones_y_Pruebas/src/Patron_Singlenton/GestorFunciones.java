package Patron_Singlenton;

import java.util.ArrayList;
import java.util.List;

import Patron_Observer.Funcion;

public class GestorFunciones {
    private static GestorFunciones instance;
    private List<Funcion> funciones;

    private GestorFunciones() {
        funciones = new ArrayList<>();
    }

    public static synchronized GestorFunciones getInstance() {
        if (instance == null) {
            instance = new GestorFunciones();
        }
        return instance;
    }

    public void agregarFuncion(Funcion funcion) {
        funciones.add(funcion);
    }

    public List<Funcion> getFunciones() {
        return new ArrayList<>(funciones);
    }
}
