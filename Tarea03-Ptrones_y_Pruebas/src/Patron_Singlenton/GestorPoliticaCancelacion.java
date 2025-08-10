package Patron_Singlenton;

import java.util.ArrayList;
import java.util.List;

import clases.PoliticaCancelacion;

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
