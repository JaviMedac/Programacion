
package com.mycompany.javatest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OperacionesTest {
    
    public OperacionesTest() {
    }

    @org.junit.jupiter.api.Test
    public void testGetN1() {
        System.out.println("getN1");
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.getN1();
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testGetN2() {
        System.out.println("getN2");
        Operaciones instance = new Operaciones();
        int expResult = 0;
        int result = instance.getN2();
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testSuma() {
        System.out.println("suma");
        int n1 = 6;
        int n2 = 5;
        Operaciones instance = new Operaciones();
        int expResult = 11;
        int result = instance.suma(n1, n2);
        assertEquals(expResult, result);
       // fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testResta() {
        System.out.println("resta");
        int n1 = 10;
        int n2 = 7;
        Operaciones instance = new Operaciones();
        int expResult = 6;
        int result = instance.resta(n1, n2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testMultiplicacion() {
        System.out.println("multiplicacion");
        int n1 = 2;
        int n2 = 9;
        Operaciones instance = new Operaciones();
        int expResult = 18;
        int result = instance.multiplicacion(n1, n2);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @org.junit.jupiter.api.Test
    public void testDivision() {
        System.out.println("division");
        int n1 = 6;
        int n2 = 0;
        Operaciones instance = new Operaciones();
        
        double expResult = 2.0;
        double result = instance.division(n1, n2);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
}
