package clases;

import Patron_Singlenton.GestorIncidentes;

public class AdministradorEvento extends Usuario {

    public AdministradorEvento(String nombre, String email) {
        super(nombre, email);
    }

    public void solucionarIncidente(Incidente incidente) {

        GestorIncidentes gi = GestorIncidentes.getInstance();

        for (int i = 0; i < gi.getIncidentes().size(); i++) {
            if (gi.getIncidentes().get(i).equals(incidente)) {
                gi.getIncidentes().remove(i);
                break;
            }
        }

        System.out.println("El problema ha sido solucionado");
    };
}
