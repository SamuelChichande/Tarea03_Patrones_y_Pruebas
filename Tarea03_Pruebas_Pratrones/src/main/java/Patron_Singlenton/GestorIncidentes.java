/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Singlenton;

import Clases.Incidente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
public class GestorIncidentes {
    private static GestorIncidentes instance;
    private List<Incidente> incidentes;

    private GestorIncidentes() {
        incidentes = new ArrayList<>();
    }

    public static synchronized GestorIncidentes getInstance() {
        if (instance == null) {
            instance = new GestorIncidentes();
        }
        return instance;
    }

    public void agregarIncidente(Incidente incidente) {
        incidentes.add(incidente);
    }

    public List<Incidente> getIncidentes() {
        return new ArrayList<>(incidentes);
    }

}
