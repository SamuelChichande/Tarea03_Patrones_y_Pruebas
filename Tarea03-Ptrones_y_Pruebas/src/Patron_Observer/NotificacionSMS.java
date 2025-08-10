package Patron_Observer;

public class NotificacionSMS implements NotificacionListener {

    @Override
    public void actualizar() {
        // Proceso de envio de notificacion por SMS
        System.out.println("Se ha notificado a todos los clientes por medio de SMS de manera exitosa.");
    }

}
