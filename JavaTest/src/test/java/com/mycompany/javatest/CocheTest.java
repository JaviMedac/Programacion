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
public class CocheTest {
    
    public CocheTest() {
    }

    @Test
    public void testPrecioFinal() throws Exception {
        System.out.println("precioFinal");
        float descuento = 50F;
        Coche instance = new Coche("Seat", 20000);
        float expResult = 10000F;
        float result = instance.precioFinal(descuento);
        assertEquals(expResult, result, 0);
        //fail("The test case is a prototype.");
    }
    
}
