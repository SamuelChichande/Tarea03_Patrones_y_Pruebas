/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patron_Observer;

/**
 *
 * @author Schic
 */
public class NotificacionEmail implements NotificacionListener {

    @Override
    public void actualizar() {
        // Proceso de envio de notificacion por email
        System.out.println("Se ha notificado a todos los clientes por medio de email de manera exitosa.");
    }

}
