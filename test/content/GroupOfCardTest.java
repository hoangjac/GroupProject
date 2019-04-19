/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jack.hoang
 */
public class GroupOfCardTest {
    
    public GroupOfCardTest() {
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
     * Test of getDeckSuit method, of class GroupOfCard.
     */
    @Test
    public void testGetDeckSuit() {
        System.out.println("getDeckSuit");
        GroupOfCard instance = new GroupOfCard();
        String[] expResult = null;
        String[] result = instance.getDeckSuit();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeckValue method, of class GroupOfCard.
     */
    @Test
    public void testGetDeckValue() {
        System.out.println("getDeckValue");
        GroupOfCard instance = new GroupOfCard();
        LinkedList expResult = null;
        LinkedList result = instance.getDeckValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
