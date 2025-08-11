/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Clases;

import Patron_Observer.Funcion;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

/**
 *
 * @author Cesar Moreira
 */
public class AdministradorSistemaTest {

    public AdministradorSistemaTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    @DisplayName("Crear eventos con entradas null")
    public void AS1() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Evento e = admin.crearEvento(null, null);

        assertNotNull(e);
    }

    @Test
    @DisplayName("Crear eventos con entradas vacias")
    public void AS2() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Evento e = admin.crearEvento("", "");

        assertNotNull(e);
    }

    @Test
    @DisplayName("Crear un evento valido")
    public void AS3() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Evento e = admin.crearEvento("Título", "Descripcion");

        assertNotNull(e);

        String nomEvent = e.getClass().getSimpleName();
        assertTrue(nomEvent.equals("EventoTeatro") || nomEvent.equals("EventoStandUp") || nomEvent.equals("EventoMicroTeatro"));
    }

    @Test
    @DisplayName("Crear una promocion con valores validos")
    public void AS4() {
        AdministradorSistema admin = new AdministradorSistema("Admin", "a@a.com");

        Promocion p = admin.definirPromocion("Promo 2x1", 0.5f);

        assertNotNull(p);
        assertEquals("Promo 2x1", p.getDescripcion());
        assertEquals(0.5f, p.getDescuento());
    }
    
    
    
    
    

    /**
     * Test of crearEvento method, of class AdministradorSistema.
     */
    @Test
    public void testCrearEvento() {
        System.out.println("crearEvento");
        String titulo = "";
        String descripcion = "";
        AdministradorSistema instance = null;
        Evento expResult = null;
        Evento result = instance.crearEvento(titulo, descripcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarEvento method, of class AdministradorSistema.
     */
    @Test
    public void testModificarEvento() {
        System.out.println("modificarEvento");
        Evento evento = null;
        AdministradorSistema instance = null;
        Evento expResult = null;
        Evento result = instance.modificarEvento(evento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarFuncion method, of class AdministradorSistema.
     */
    @Test
    public void testConfigurarFuncion() {
        System.out.println("configurarFuncion");
        Funcion funcion = null;
        AdministradorSistema instance = null;
        Funcion expResult = null;
        Funcion result = instance.configurarFuncion(funcion);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of definirPromocion method, of class AdministradorSistema.
     */
    @Test
    public void testDefinirPromocion() {
        System.out.println("definirPromocion");
        String descripcion = "";
        float descuento = 0.0F;
        AdministradorSistema instance = null;
        Promocion expResult = null;
        Promocion result = instance.definirPromocion(descripcion, descuento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of configurarPoliticaCancelamiento method, of class
     * AdministradorSistema.
     */
    @Test
    public void testConfigurarPoliticaCancelamiento() {
        System.out.println("configurarPoliticaCancelamiento");
        PoliticaCancelacion politicaCancelacion = null;
        AdministradorSistema instance = null;
        instance.configurarPoliticaCancelamiento(politicaCancelacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
