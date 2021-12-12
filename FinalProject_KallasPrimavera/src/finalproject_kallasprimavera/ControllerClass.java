 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author kalla
 */
//what user will be able to control
public class ControllerClass {
    // add the user model and view classes to our controller class
    private ModelClass model;
    private ViewClass view;
    Scanner userInput = new Scanner(System.in);//scanner to read strings
    Scanner numberInput = new Scanner(System.in);//scanner to read ints
    
    // Create a constructor
    public ControllerClass(ModelClass model, ViewClass view){
        this.model = model;
        this.view = view;
    }
    /* block of code to see if user is librarian or student*/
    public String getUserType(){
        
        // Initialize variables for role input
        String userType;
        UserFactory userFactory = new UserFactory();
        
        // Ask for user role and ensure the input is valid
        do{
            System.out.println("What type of user are you? Librarian or Student: ");
            userType = userInput.nextLine();
            
            userFactory.getUser(userType);
        } while(UserFactory.getUser(userType) == null); 
        
        return userType; //returns what the user finally enters correct user
    }
    //what the librarian will be able to do
    public void librarianControl() throws SQLException{
        LibrarianClass librarian = new LibrarianClass();
        view.viewOptionsLibrarian(librarian);
        
        int option = numberInput.nextInt();//whatever librarian enters as option will be read here
        
        //depending on what librarian chooses, different methods from model will be executed
        switch(option){
            case 1:
                System.out.println("Please enter SN of book");
                String sn = userInput.nextLine();
                System.out.println("Please enter title of book");
                String title = userInput.nextLine();
                System.out.println("Please enter author of book");
                String author = userInput.nextLine();
                System.out.println("Please enter publisher of book");
                String publisher = userInput.nextLine();
                System.out.println("Please enter quantity of "+title);
                int quantity = numberInput.nextInt();
                System.out.println("Please enter today's date (YYYY)");
                String date = userInput.nextLine();
                model.addBook(sn, title, author, publisher, quantity, date);
                break;
            case 2:
                System.out.println("Please enter id of this process");
                int id = numberInput.nextInt();
                System.out.println("Please enter sn of the book");
                String sn2 = userInput.nextLine();
                System.out.println("Please enter student id of student");
                int studentId = numberInput.nextInt();
                System.out.println("Please enter today's date (YYYY)");
                String issueDate = userInput.nextLine();
                model.issueBook(id, sn2, studentId, issueDate);
                break;
            case 3:
                System.out.println("Enter today's date");
                String todayDate = userInput.nextLine();
                System.out.println("Enter the sn of the book you are returning");
                String sn3 = userInput.nextLine();
                model.returnBook(todayDate, sn3);
                break;
            case 4:
                view.issueBooksTable();
                break;
        }
    }
    
    public void studentControl(){
        StudentClass student = new StudentClass();
        view.viewOptionsStudent(student);
        
        //if user chooses wtv call model method
        
    }
    
    
}
