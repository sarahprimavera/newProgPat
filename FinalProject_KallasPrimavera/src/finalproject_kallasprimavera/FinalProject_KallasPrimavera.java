/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;


import java.sql.*;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;
/**
 *
 * @author kalla
 */
public class FinalProject_KallasPrimavera {

    /**
     * @param args the command line arguments
    */
    
    public static void main(String[] args) throws SQLException {
        // create a model, ontroller and a view
        ModelClass model = new ModelClass();
        ViewClass view = new ViewClass();
        ControllerClass controller = new ControllerClass(model, view);

        //displays welcome message
        controller.welcomeMessage();
        
        // ask for userType
        String user = controller.getUserType();
        
        // displayoptions + do action
        if(user.equalsIgnoreCase("librarian")){
            controller.librarianControl();
        } else {
            controller.studentControl();
        }
        // for above, i added a exit option, i wanna do something like while X case isnt selected keep doing the control 
        // that way when they exit they can exit
        
    }
}
    
    

    
    



    

