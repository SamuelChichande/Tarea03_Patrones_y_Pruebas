/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Singlenton;

import Patron_Observer.Funcion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
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
