/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Singlenton;

import Clases.PoliticaCancelacion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Schic
 */
public class GestorPoliticaCancelacion {
    private static GestorPoliticaCancelacion instance;
    private List<PoliticaCancelacion> politicaCancelaciones;

    private GestorPoliticaCancelacion() {
        politicaCancelaciones = new ArrayList<>();
    }

    public static synchronized GestorPoliticaCancelacion getInstance() {
        if (instance == null) {
            instance = new GestorPoliticaCancelacion();
        }
        return instance;
    }

    public void agregarPoliticaCancelacion(PoliticaCancelacion politicaCancelacion) {
        politicaCancelaciones.add(politicaCancelacion);
    }

    public List<PoliticaCancelacion> getIncidentes() {
        return new ArrayList<>(politicaCancelaciones);
    }
}
