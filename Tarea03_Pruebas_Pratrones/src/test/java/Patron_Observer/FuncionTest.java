/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Patron_Observer;

import Clases.Evento;
import Clases.EventoTeatro;
import Patron_Factory_Method.Asiento;
import java.time.LocalDateTime;
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
public class FuncionTest {
    
    public FuncionTest() {
    }

    
    @Test
    @DisplayName("Prueba para caso comun")
    public void Funcion(){
        Evento e = new EventoTeatro("Romeo y Julieta", "Es una tragedia del dramaturgo inglés William Shakespeare");
        Funcion f = new Funcion(1, e, LocalDateTime.now(), "ESPOL");
        assertNotNull(f);
        assertEquals(e, f.getEvento());
    }
    
    
    
    
    
    
    
    
    
    /**
     * Test of getAsientosDisponibles method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGetAsientosDisponibles() {
        System.out.println("getAsientosDisponibles");
        Funcion instance = null;
        List<Asiento> expResult = null;
        List<Asiento> result = instance.getAsientosDisponibles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reprogramar method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testReprogramar() {
        System.out.println("reprogramar");
        LocalDateTime fechaHora = null;
        String ubicacion = "";
        Funcion instance = null;
        instance.reprogramar(fechaHora, ubicacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelar method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testCancelar() {
        System.out.println("cancelar");
        Funcion instance = null;
        instance.cancelar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGetId() {
        System.out.println("getId");
        Funcion instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Funcion instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEvento method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGetEvento() {
        System.out.println("getEvento");
        Funcion instance = null;
        Evento expResult = null;
        Evento result = instance.getEvento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEvento method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testSetEvento() {
        System.out.println("setEvento");
        Evento evento = null;
        Funcion instance = null;
        instance.setEvento(evento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaHora method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGetFechaHora() {
        System.out.println("getFechaHora");
        Funcion instance = null;
        LocalDateTime expResult = null;
        LocalDateTime result = instance.getFechaHora();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaHora method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testSetFechaHora() {
        System.out.println("setFechaHora");
        LocalDateTime fechaHora = null;
        Funcion instance = null;
        instance.setFechaHora(fechaHora);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUbicacion method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGetUbicacion() {
        System.out.println("getUbicacion");
        Funcion instance = null;
        String expResult = "";
        String result = instance.getUbicacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUbicacion method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testSetUbicacion() {
        System.out.println("setUbicacion");
        String ubicacion = "";
        Funcion instance = null;
        instance.setUbicacion(ubicacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAsientos method, of class Funcion.
     */
    @org.junit.jupiter.api.Test
    public void testGetAsientos() {
        System.out.println("getAsientos");
        Funcion instance = null;
        List<Asiento> expResult = null;
        List<Asiento> result = instance.getAsientos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
