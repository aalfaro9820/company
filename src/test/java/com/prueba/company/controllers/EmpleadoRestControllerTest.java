/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prueba.company.controllers;

import com.prueba.company.entity.Empleado;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.ws.Response;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author alalfaro
 */
public class EmpleadoRestControllerTest {

    public EmpleadoRestControllerTest() {
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
     * Test of index method, of class EmpleadoRestController.
     */
    @Test
    public void testIndex() {
        System.out.println("index");
        EmpleadoRestController instance = new EmpleadoRestController();
        List<Empleado> expResult = new ArrayList<>();
        Empleado emp1 = new Empleado(1, new BigInteger("1"), "alex");
        Empleado emp2 = new Empleado(1, new BigInteger("2"), "alex 2");
        expResult.add(emp1);
        expResult.add(emp2);
        List<Empleado> result = instance.index();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of show method, of class EmpleadoRestController.
     */
    @Test
    public void testShow() {
        System.out.println("show");
        Integer id = 1;
        EmpleadoRestController instance = new EmpleadoRestController();
        List<Empleado> expResult = new ArrayList<>();
        Empleado emp1 = new Empleado(1, new BigInteger("1"), "alex");
        ResponseEntity result = instance.show(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of create method, of class EmpleadoRestController.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Empleado empleado = new Empleado(1, new BigInteger("1"), "alex");
        EmpleadoRestController instance = new EmpleadoRestController();
        ResponseEntity expResult = new ResponseEntity(empleado, HttpStatus.CREATED);
        ResponseEntity result = instance.create(empleado);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class EmpleadoRestController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Empleado empleado = null;
        Integer id = null;
        EmpleadoRestController instance = new EmpleadoRestController();
        ResponseEntity expResult = null;
        ResponseEntity result = instance.update(empleado, id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class EmpleadoRestController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Integer id = 1;
        EmpleadoRestController instance = new EmpleadoRestController();
        ResponseEntity result = instance.delete(id);
        Map<String, Object> response = new HashMap<>();
        response.put("mensaje", "El empleado se ha eliminado correctamente");
        ResponseEntity expResult = new ResponseEntity(response, HttpStatus.ACCEPTED);

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
