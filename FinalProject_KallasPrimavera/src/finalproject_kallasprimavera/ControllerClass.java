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
    
    // Create a constructor
    public ControllerClass(ModelClass model, ViewClass view){
        this.model = model;
        this.view = view;
    }
    /* block of code to see if user is librarian or student*/
    public String getUserType(){
        Scanner userInput = new Scanner(System.in);
        // Initialize variables for role input
        String userType;
        //boolean isUserCorrect = true;
        UserFactory userFactory = new UserFactory();
        
        // Ask for user role and ensure the input is valid
        do{
            System.out.println("What type of user are you? Librarian or Student: ");
            userType = userInput.nextLine();
            
            userFactory.getUser(userType);
        } while(UserFactory.getUser(userType) == null); 
        
        return userType; //returns what the user finally enters correct user
    }
    
    
    //if user is librarian
    
    
}
