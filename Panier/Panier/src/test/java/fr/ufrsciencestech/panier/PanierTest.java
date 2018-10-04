/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author profil
 */
public class PanierTest {
    
    public PanierTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addOrange method, of class Panier.
     */
    @Test
    public void testAddOrange() {
        System.out.println("addOrange");
        Orange o = null;
        Panier instance = null;
        instance.addOrange(o);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeLastOrange method, of class Panier.
     */
    @Test
    public void testRemoveLastOrange() {
        System.out.println("removeLastOrange");
        Panier instance = null;
        instance.removeLastOrange();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Panier.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Orange comp = null;
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.contains(comp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estPlein method, of class Panier.
     */
    @Test
    public void testEstPlein() {
        System.out.println("estPlein");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estPlein();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of estVide method, of class Panier.
     */
    @Test
    public void testEstVide() {
        System.out.println("estVide");
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.estVide();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Panier.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Panier instance = null;
        double expResult = 0.0;
        double result = instance.getPrix();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of boycotteOrigine method, of class Panier.
     */
    @Test
    public void testBoycotteOrigine() {
        System.out.println("boycotteOrigine");
        String boy = "";
        Panier instance = null;
        instance.boycotteOrigine(boy);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Panier.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Panier instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Panier.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Panier comp = null;
        Panier instance = null;
        boolean expResult = false;
        boolean result = instance.equals(comp);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
