/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package content;

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
public class PlayerTest {

    public PlayerTest() {
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
     * Test of getPLayerID method, of class Player.
     */
    @Test
    public void testGetPLayerID() {
        System.out.println("getPLayerID");
        Player1 instance = new Player1("Jack");
        instance.getPLayerID();
        String expResult = "Jack";
        String result = instance.getPLayerID();
        assertEquals(expResult, result);
    }
}
