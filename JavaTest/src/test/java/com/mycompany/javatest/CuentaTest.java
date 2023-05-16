/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.javatest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class CuentaTest {
    
    public CuentaTest() {
    }

    @Test
    public void testDeposita() {
        System.out.println("deposita");
        int q = 250;
        Cuenta instance = new Cuenta(0,"1234");
        int expResult = 250;
        int result = instance.deposita(q);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testRetira() {
        System.out.println("retira");
        int q = 250;
        String cc = "1234";
        Cuenta instance =  new Cuenta(1250,"1234");;
        int expResult = 1000;
        int result = instance.retira(q, cc);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDimeSaldo() {
        System.out.println("dimeSaldo");
        Cuenta instance = null;
        int expResult = 0;
        int result = instance.dimeSaldo();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDimeContra() {
        System.out.println("dimeContra");
        Cuenta instance = null;
        String expResult = "";
        String result = instance.dimeContra();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }
    
}
