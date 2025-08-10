/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import Patron_Decorator.TicketComponent;
import Patron_Factory_Method.Asiento;
import Patron_Factory_Method.AsientoBalcon;
import Patron_Factory_Method.AsientoPlatea;
import Patron_Factory_Method.AsientoVIP;
import Patron_Observer.Funcion;
import Patron_Singlenton.GestorFunciones;
import java.time.LocalDateTime;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
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
public class ClienteTest {
    
    public ClienteTest() {
    }
    
    @Test
    @DisplayName("Prueba para caso comun seleccionarFuncion")
    public void c1(){
        Evento e = new EventoTeatro("Romeo y Julieta", "Es una tragedia del dramaturgo inglés William Shakespeare");
        Funcion f = new Funcion(1, e, LocalDateTime.now(), "ESPOL");
        GestorFunciones gf = GestorFunciones.getInstance();
        gf.agregarFuncion(f);
        
        Cliente c = new Cliente("Roberto", "rto@hotmail.com");
        
        assertEquals(f, c.seleccionarFuncion(1));
    }
    
    @Test
    @DisplayName("Comprobar para casos vacios reservarAsiento")
    public void c2(){
        Cliente c = new Cliente("Roberto", "rto@hotmail.com");
        assertNull(c.reservarAsientos(null, null));
    }
    
    @Test
    @DisplayName("Comprobar para caso comun reservarAsiento")
    public void c3(){
        Evento e = new EventoTeatro("Romeo y Julieta", "Es una tragedia del dramaturgo inglés William Shakespeare");
        Funcion f = new Funcion(1, e, LocalDateTime.now(), "ESPOL");
        GestorFunciones gf = GestorFunciones.getInstance();
        gf.agregarFuncion(f);
        
        Cliente c = new Cliente("Roberto", "rto@hotmail.com");
        
        List<Asiento> a = new ArrayList<>();
        a.add(new AsientoBalcon(c, "AsientoBalcon"));
        a.add(new AsientoPlatea(c, "AsientoBalcon"));
        a.add(new AsientoVIP(c, "AsientoBalcon"));
        
        assertTrue(c.equals(c.reservarAsientos(a, f).getUsuario()));
    }
    
    @Test
    @DisplayName("Comprobar que se compro un ticket comun, sin opciones adicionales")
    public void c4(){
        Evento e = new EventoTeatro("Romeo y Julieta", "Es una tragedia del dramaturgo inglés William Shakespeare");
        Funcion f = new Funcion(1, e, LocalDateTime.now(), "ESPOL");
        
        Cliente c = new Cliente("Roberto", "rto@hotmail.com");
        
        List<Asiento> a = new ArrayList<>();
        a.add(new AsientoBalcon(c, "AsientoBalcon"));
        a.add(new AsientoPlatea(c, "AsientoBalcon"));
        a.add(new AsientoVIP(c, "AsientoBalcon"));
        
        Reservacion r = c.reservarAsientos(a, f);
        assertTrue(5 == c.comprarTicket(r).precio());
    }
    
    
    
    
    
    /**
     * Test of verEventos method, of class Cliente.
     */
    @Test
    public void testVerEventos() {
        System.out.println("verEventos");
        Cliente instance = null;
        List<Evento> expResult = null;
        List<Evento> result = instance.verEventos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of seleccionarFuncion method, of class Cliente.
     */
    @Test
    public void testSeleccionarFuncion() {
        System.out.println("seleccionarFuncion");
        int id = 0;
        Cliente instance = null;
        Funcion expResult = null;
        Funcion result = instance.seleccionarFuncion(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comprarTicket method, of class Cliente.
     */
    @Test
    public void testComprarTicket() {
        System.out.println("comprarTicket");
        Reservacion reservacion = null;
        Cliente instance = null;
        TicketComponent expResult = null;
        TicketComponent result = instance.comprarTicket(reservacion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
}
