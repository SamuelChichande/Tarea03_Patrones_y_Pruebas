/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Patron_Decorator;

import Clases.Cliente;
import Clases.Evento;
import Clases.EventoTeatro;
import Patron_Observer.Funcion;
import Patron_Singlenton.GestorFunciones;
import java.time.LocalDateTime;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Schic
 */
public class TicketDecoratorTest {
    
    public TicketDecoratorTest() {
    }
    
    @Test
    @DisplayName("Verificacion de precios")
    public void TD1(){
        Evento e = new EventoTeatro("Romeo y Julieta", "Es una tragedia del dramaturgo inglés William Shakespeare");
        Funcion f = new Funcion(1, e, LocalDateTime.now(), "ESPOL");
        GestorFunciones gf = GestorFunciones.getInstance();
        gf.agregarFuncion(f);
        
        Cliente c = new Cliente("Roberto", "rto@hotmail.com");
        
        BasicTicket bt = new BasicTicket(f, c);
        TicketDecorator td = new TicketBebida(bt);
        
        assertTrue(6.5 == td.precio());
    }
            
    
}
