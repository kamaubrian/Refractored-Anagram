/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Brian Kamau
 */
public class StaticWordsTest {
    
    public StaticWordsTest() {
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
     * Test of getWord method, of class StaticWords.
     */
    @Test
    public void testGetWord() {
        System.out.println("getWord");
        int index = 0;
        StaticWords instance = new StaticWords();
        String expResult = "abstraction";
        String result = instance.getWord(index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getScrambledword method, of class StaticWords.
     */
    @Test
    public void testGetScrambledword() {
        System.out.println("getScrambledword");
        int index = 0;
        StaticWords instance = new StaticWords();
        String expResult = "batsartcoin";
        String result = instance.getScrambledword(index);
        assertEquals(expResult, result);

    }

    /**
     * Test of getSize method, of class StaticWords.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        StaticWords instance = new StaticWords();
        int expResult = 45;
        int result = instance.getSize();
        assertEquals(expResult, result);

    }

    /**
     * Test of Correct method, of class StaticWords.
     */
    @Test
    public void testCorrect() {
        System.out.println("Correct");
        int index = 0;
        String userGuess = "";
        StaticWords instance = new StaticWords();
        boolean expResult = false;
        boolean result = instance.Correct(index, userGuess);
        assertEquals(expResult, result);

    }
    
}
