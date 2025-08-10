package Patron_Singlenton;

import java.util.ArrayList;
import java.util.List;

import clases.Incidente;

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
