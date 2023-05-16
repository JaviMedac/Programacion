/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package subidapunto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Usuario
 */
public class EnfermeroTest {
    
    public EnfermeroTest() {
    }

    /**
     * Test of getId_enfermero method, of class Enfermero.
     */
    @Test
    public void testGetId_enfermero() {
        System.out.println("getId_enfermero");
        Enfermero instance = null;
        String expResult = "";
        String result = instance.getId_enfermero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setId_enfermero method, of class Enfermero.
     */
    @Test
    public void testSetId_enfermero() {
        System.out.println("setId_enfermero");
        String id_enfermero = "";
        Enfermero instance = null;
        instance.setId_enfermero(id_enfermero);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of hacerInforme method, of class Enfermero.
     */
    @Test
    public void testHacerInforme() {
        System.out.println("hacerInforme");
        Enfermero instance = null;
        instance.hacerInforme();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of derivarEspecialista method, of class Enfermero.
     */
    @Test
    public void testDerivarEspecialista() {
        System.out.println("derivarEspecialista");
        String datos = "34";
        Enfermero instance = new Enfermero(datos);
        instance.derivarEspecialista(datos);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
