/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Observer;

/**
 *
 * @author Schic
 */
public class NotificacionSMS implements NotificacionListener {

    @Override
    public void actualizar() {
        // Proceso de envio de notificacion por SMS
        System.out.println("Se ha notificado a todos los clientes por medio de SMS de manera exitosa.");
    }

}
