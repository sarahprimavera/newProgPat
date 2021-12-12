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
     
    WHAT IS NEEDED AND WHERE ITS DONE
    MVC:
        model class -- Should be 2 (one arrayList of books and one of students to add stuff to database)
        view class 
        control class
    design pattern:
        factory -- WILL BE DONE in UserFactory - interface user - options Student class and Librarian class
            librarian user -> along with their methods
            student user -> along with their methods
        singleton -- DONE in GetConnection Class
            to make sure there's only one connection to the database

    */
    
    public static void main(String[] args) {
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
        //im messing aroundddd
        // Initialize variables for role input
        String userType;
        boolean isUserCorrect = true;
        UserFactory userFactory = new UserFactory();
        
        // Ask for user role and ensure the input is valid
        do{
            System.out.println("What type of user are you? Librarian or Student: ");
            userType = userInput.nextLine();
            
            userFactory.getUser(userType);
            if(userType.equalsIgnoreCase("Librarian")){
                isUserCorrect = true;
            } else if(userType.equalsIgnoreCase("Student")){
                isUserCorrect = true;
            } else{
                isUserCorrect = false;
            }
        } while(isUserCorrect == false);
    }
}
    
    

    
    



    

