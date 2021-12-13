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
public class ModelClassTest {
    
    public ModelClassTest() {
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
     * Test of addBook method, of class ModelClass.
     */
    @Test
    public void testAddBook() {
        System.out.println("addBook");
        String sn = "9999999999999";
        String title = "This is the Title";
        String author = "Author Name";
        String publisher = "Publisher";
        int quantity = 0;
        String addedDate = "2021";
        ModelClass instance = new ModelClass();
        instance.addBook(sn, title, author, publisher, quantity, addedDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of issueBook method, of class ModelClass.
     */
    @Test
    public void testIssueBook() {
        System.out.println("issueBook");
        int id = 0;
        String sn = "111111111";
        int studentId = 0;
        String issueDate = "Richie Tozier";
        ModelClass instance = new ModelClass();
        instance.issueBook(id, sn, studentId, issueDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewIssueBookWithStudent method, of class ModelClass.
     */
    @Test
    public void testViewIssueBookWithStudent() {
        System.out.println("viewIssueBookWithStudent");
        ModelClass instance = new ModelClass();
        instance.viewIssueBookWithStudent();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchBookByTitle method, of class ModelClass.
     */
    @Test
    public void testSearchBookByTitle() {
        System.out.println("searchBookByTitle");
        String title = "Pride&Prejudice";
        ModelClass instance = new ModelClass();
        instance.searchBookByTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchBookByAuthor method, of class ModelClass.
     */
    @Test
    public void testSearchBookByAuthor() {
        System.out.println("searchBookByAuthor");
        String author = "Laura Dave";
        ModelClass instance = new ModelClass();
        instance.searchBookByAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewBookCatalogue method, of class ModelClass.
     */
    @Test
    public void testViewBookCatalogue() {
        System.out.println("viewBookCatalogue");
        ModelClass instance = new ModelClass();
        instance.viewBookCatalogue();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrowBook method, of class ModelClass.
     */
    @Test
    public void testBorrowBook() {
        System.out.println("borrowBook");
        int id = 0;
        String sn = "121212121";
        int studentId = 0;
        String issueDate = "2021";
        ModelClass instance = new ModelClass();
        instance.borrowBook(id, sn, studentId, issueDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnBook method, of class ModelClass.
     */
    @Test
    public void testReturnBook() {
        System.out.println("returnBook");
        String todayDate = "2002";
        String bookSN = "121212121";
        ModelClass instance = new ModelClass();
        instance.returnBook(todayDate, bookSN);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getsn method, of class ModelClass.
     */
    @Test
    public void testGetsn() {
        System.out.println("getsn");
        ModelClass instance = new ModelClass();
        String expResult = "";
        String result = instance.getsn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSn method, of class ModelClass.
     */
    @Test
    public void testSetSn() {
        System.out.println("setSn");
        String sn = "";
        ModelClass instance = new ModelClass();
        instance.setSn(sn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class ModelClass.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        ModelClass instance = new ModelClass();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class ModelClass.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        ModelClass instance = new ModelClass();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAuthor method, of class ModelClass.
     */
    @Test
    public void testGetAuthor() {
        System.out.println("getAuthor");
        ModelClass instance = new ModelClass();
        String expResult = "";
        String result = instance.getAuthor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAuthor method, of class ModelClass.
     */
    @Test
    public void testSetAuthor() {
        System.out.println("setAuthor");
        String author = "";
        ModelClass instance = new ModelClass();
        instance.setAuthor(author);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPublisher method, of class ModelClass.
     */
    @Test
    public void testGetPublisher() {
        System.out.println("getPublisher");
        ModelClass instance = new ModelClass();
        String expResult = "";
        String result = instance.getPublisher();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPublisher method, of class ModelClass.
     */
    @Test
    public void testSetPublisher() {
        System.out.println("setPublisher");
        String publisher = "";
        ModelClass instance = new ModelClass();
        instance.setPublisher(publisher);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class ModelClass.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        ModelClass instance = new ModelClass();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class ModelClass.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 0;
        ModelClass instance = new ModelClass();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddedDate method, of class ModelClass.
     */
    @Test
    public void testGetAddedDate() {
        System.out.println("getAddedDate");
        ModelClass instance = new ModelClass();
        String expResult = "";
        String result = instance.getAddedDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddedDate method, of class ModelClass.
     */
    @Test
    public void testSetAddedDate() {
        System.out.println("setAddedDate");
        String addedDate = "";
        ModelClass instance = new ModelClass();
        instance.setAddedDate(addedDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
