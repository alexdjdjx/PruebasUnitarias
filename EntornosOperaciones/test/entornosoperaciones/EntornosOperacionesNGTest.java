/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package entornosoperaciones;

import java.util.NoSuchElementException;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author alumno
 */
public class EntornosOperacionesNGTest {

    int[] prueba = new int[]{10, 1, 20, 2, 25, 65, 125, 12, 31, 85, 78, 31, 89, 67, 95, 98};
    EntornosOperaciones pruebas = new EntornosOperaciones(prueba);

    public EntornosOperacionesNGTest() {

    }

    @BeforeClass
    public static void setUpClass() throws Exception {

    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    @Test
    public void testCrearMatrizNula() {
        try {
            EntornosOperaciones matrizNula = null;
        } catch (IllegalArgumentException ex) {
        }

    }

    @Test
    public void testCrearMatrizVacia() {
        try {
            EntornosOperaciones matrizNula = new EntornosOperaciones(new int[0]);
        } catch (IllegalArgumentException ex) {
        }

    }

    /**
     * Test of getMaximo method, of class EntornosOperaciones.
     */
    @Test
    public void testGetMaximo() {
        System.out.println("getMaximo");
        EntornosOperaciones instance = pruebas;
        int expResult = 125;
        int result = instance.getMaximo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getMinimo method, of class EntornosOperaciones.
     */
    @Test
    public void testGetMinimo() {
        System.out.println("getMinimo");
        EntornosOperaciones instance = pruebas;
        int expResult = 1;
        int result = instance.getMinimo();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getSuma method, of class EntornosOperaciones.
     */
    @Test
    public void testGetSuma() {
        System.out.println("getSuma");
        EntornosOperaciones instance = pruebas;
        int expResult = 834;
        int result = instance.getSuma();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail
    }

    /**
     * Test of getIndiceDe method, of class EntornosOperaciones.
     */
    @Test
    public void testGetIndiceDe() {
        System.out.println("getIndiceDe");
        int numero = 2;
        EntornosOperaciones instance = pruebas;
        int expResult = 3;
        int result = instance.getIndiceDe(numero);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
    }

    @Test
    public void testGetIndiceEquivocadoDe() {
        try {
            System.out.println("getIndiceDe");
            int numero = 169;
            EntornosOperaciones instance = pruebas;
            int expResult = 3;
            int result = instance.getIndiceDe(numero);
            assertEquals(result, expResult);
        } catch (NoSuchElementException ex) {

        }

        // TODO review the generated test code and remove the default call to fail.
    }

}
