 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

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
    
    public void librarianControl(){
        LibrarianClass librarian = new LibrarianClass();
        view.viewOptionsLibrarian(librarian);
        
        int option = numberInput.nextInt();
        
        //if option is 1-> ask librarin for sn,title,author,publisher,addedDate  
        //model.addBook(wtv librarian inputs goes as parameter)
    }
    
    public void studentControl(){
        StudentClass student = new StudentClass();
        view.viewOptionsStudent(student);
        
        //if user chooses wtv call model method
        
    }
    
    
}
