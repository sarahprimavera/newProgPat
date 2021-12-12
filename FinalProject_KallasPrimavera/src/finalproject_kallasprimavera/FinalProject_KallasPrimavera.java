/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
 
import javax.swing.*;
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
        
        
        // Create a Scanner for future input.
        Scanner userInput = new Scanner(System.in);

        // Print a welcome message
        System.out.println("Welcome!");
        
        // Initialize variables for Language Input
        String langInput;
        boolean isLangCorrect = false;
        
        // Ask for language and check if the input is valid
        while(isLangCorrect == false){
            System.out.println("What language would you like to use today? Please type in en or fr: ");
            langInput = userInput.nextLine();
            if(langInput.equalsIgnoreCase("en") || langInput.equalsIgnoreCase("fr")){
                isLangCorrect = true;
            } else {
                System.out.println("Sorry, that was not a correct entry.");
            }
        }
        
        // ask for userType
        String user = controller.getUserType();
        
        // displayoptions + do action
        if(user.equalsIgnoreCase("librarian")){
            controller.librarianControl();
        } else {
            controller.studentControl();
        }
    }
}
    
    

    
    



    

