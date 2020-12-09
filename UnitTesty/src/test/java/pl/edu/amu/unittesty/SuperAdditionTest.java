/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.amu.unittesty;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jw56288
 */
public class SuperAdditionTest {
    
    public SuperAdditionTest() {
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
     * Test of superaddition method, of class SuperAddition.
     */
    @org.junit.Test
    public void testSuperaddition() {
        System.out.println("superaddition");
        String a = "1";
        String b = "2";
        String expResult = "4";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        @org.junit.Test
    public void testSuperaddition1() {
        System.out.println("superaddition");
        String a = "x";
        String b = "y";
        String expResult = "xy";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition2() {
        System.out.println("superaddition");
        String a = "1";
        String b = "1";
        String expResult = "0";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition3() {
        System.out.println("superaddition");
        String a = "a";
        String b = "b";
        String expResult = "e";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition4() {
        System.out.println("superaddition");
        String a = "100";
        String b = "1";
        String expResult = "101";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition5() {
        System.out.println("superaddition");
        String a = "aa";
        String b = "bb";
        String expResult = "ee";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition6() {
        System.out.println("superaddition");
        String a = "3";
        String b = "5";
        String expResult = "13";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @org.junit.Test
    public void testSuperaddition7() {
        System.out.println("superaddition");
        String a = "s";
        String b = "g";
        String expResult = "gs";
        String result = SuperAddition.superaddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
