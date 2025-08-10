package Patron_Observer;

public class NotificacionEmail implements NotificacionListener {

    @Override
    public void actualizar() {
        // Proceso de envio de notificacion por email
        System.out.println("Se ha notificado a todos los clientes por medio de email de manera exitosa.");
    }

}
