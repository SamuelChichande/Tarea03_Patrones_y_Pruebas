package clases;

import java.util.Random;

import Patron_Singlenton.GestorIncidentes;

public class SoporteCliente extends Usuario {

    public SoporteCliente(String nombre, String email) {
        super(nombre, email);
    }

    public void escalarIncidente(Incidente incidente) {
        AdministradorEvento admin = new AdministradorEvento(null, null);
        admin.solucionarIncidente(incidente);
    }

    public void solucionarIncidente(Incidente incidente) {
        Random random = new Random();
        double n = random.nextDouble();
        if (n > 0.6) {
            GestorIncidentes gi = GestorIncidentes.getInstance();

            for (int i = 0; i < gi.getIncidentes().size(); i++) {
                if (gi.getIncidentes().get(i).equals(incidente)) {
                    gi.getIncidentes().remove(i);
                    System.out.println("El problema ha sido solucionado");
                    break;
                }
            }
        } else {
            escalarIncidente(incidente);
        }

    };
}
