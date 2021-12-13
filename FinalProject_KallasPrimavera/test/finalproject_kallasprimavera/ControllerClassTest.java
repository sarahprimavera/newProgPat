/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kalla
 */
public class ControllerClassTest {
    
    public ControllerClassTest() {
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
     * Test of welcomeMessage method, of class ControllerClass.
     */
    @Test
    public void testWelcomeMessage() {
        System.out.println("welcomeMessage");
        ViewClass view = new ViewClass();
        ModelClass model = new ModelClass();
        ControllerClass instance = new ControllerClass(model, view);
        instance.welcomeMessage();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUserType method, of class ControllerClass.
     */
    @Test
    public void testGetUserType() {
        System.out.println("getUserType");
        ViewClass view = new ViewClass();
        ModelClass model = new ModelClass();
        ControllerClass instance = new ControllerClass(model, view);
        String expResult = "Student";
        String result = instance.getUserType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of librarianControl method, of class ControllerClass.
     */
    @Test
    public void testLibrarianControl() throws Exception {
        System.out.println("librarianControl");
        ViewClass view = new ViewClass();
        ModelClass model = new ModelClass();
        ControllerClass instance = new ControllerClass(model, view);
        instance.librarianControl();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of studentControl method, of class ControllerClass.
     */
    @Test
    public void testStudentControl() throws Exception {
        System.out.println("studentControl");
        ViewClass view = new ViewClass();
        ModelClass model = new ModelClass();
        ControllerClass instance = new ControllerClass(model, view);
        instance.studentControl();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
