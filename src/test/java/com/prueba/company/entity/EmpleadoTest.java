/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.company.entity;

import java.math.BigInteger;
import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author alalfaro
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
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

    /**
     * Test of getDni method, of class Empleado.
     */
    @Test
    public void testGetDni() {
        System.out.println("getDni");
        Empleado instance = new Empleado();
        BigInteger expResult = null;
        BigInteger result = instance.getDni();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDni method, of class Empleado.
     */
    @Test
    public void testSetDni() {
        System.out.println("setDni");
        BigInteger dni = null;
        Empleado instance = new Empleado();
        instance.setDni(dni);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Empleado.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Empleado.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Empleado instance = new Empleado();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCargo method, of class Empleado.
     */
    @Test
    public void testGetCargo() {
        System.out.println("getCargo");
        Empleado instance = new Empleado();
        String expResult = "";
        String result = instance.getCargo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCargo method, of class Empleado.
     */
    @Test
    public void testSetCargo() {
        System.out.println("setCargo");
        String cargo = "";
        Empleado instance = new Empleado();
        instance.setCargo(cargo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaIngreso method, of class Empleado.
     */
    @Test
    public void testGetFechaIngreso() {
        System.out.println("getFechaIngreso");
        Empleado instance = new Empleado();
        Date expResult = null;
        Date result = instance.getFechaIngreso();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaIngreso method, of class Empleado.
     */
    @Test
    public void testSetFechaIngreso() {
        System.out.println("setFechaIngreso");
        Date fechaIngreso = null;
        Empleado instance = new Empleado();
        instance.setFechaIngreso(fechaIngreso);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
