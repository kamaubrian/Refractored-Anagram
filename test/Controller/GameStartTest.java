/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.swing.JFrame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author root
 */
public class GameStartTest {
    
    public GameStartTest() {
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
     * Test of main method, of class GameStart.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GameStart.main(args);
        
    }

    /**
     * Test of showMain method, of class GameStart.
     */
    @Test
    public void testShowMain() {
        System.out.println("showMain");
        JFrame expResult = GameStart.showMain();
        JFrame result = GameStart.showMain();
        assertEquals(expResult, result);

    }
    
}
