 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
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
    
    ResourceBundle r;//resource bundle
    String internationalization;//string that will hold which key needs to be fetched
    
    // Create a constructor
    public ControllerClass(ModelClass model, ViewClass view){
        this.model = model;
        this.view = view;
    }
    public void welcomeMessage(){
        System.out.println("Welcome!/Bienvenue!");
        
        // Initialize variables for Language Input
        String langInput;
        boolean isLangCorrect = false;
        
        // Ask for language and check if the input is valid
        while(isLangCorrect == false){
            System.out.println("What language would you like to use today? Please type in en or fr: ");
            System.out.println("Quelle langue aimeriez-vous utiliser aujourd'hui? Entrez en ou fr: ");
            langInput = userInput.nextLine();
            if (langInput.equalsIgnoreCase("en")){
                Locale locale = new Locale("en","CA");
                r = ResourceBundle.getBundle("FinalProject_KallasPrimavera/Bundle",locale);
                isLangCorrect = true;
            }else if (langInput.equalsIgnoreCase("fr")){
                Locale locale = new Locale("fr","CA");
                r = ResourceBundle.getBundle("FinalProject_KallasPrimavera/Bundle_fr_CA",locale);
                isLangCorrect = true;
            }else {
                System.out.println("Sorry, that was not a correct entry.");
                System.out.println("Désolé, ce n'était pas une entrée valide.");
            }
        }
    }
 
    //method to see if user is student or librarian
    public String getUserType(){
        
        // Initialize variables for role input
        String userType;
        UserFactory userFactory = new UserFactory();
        
        // Ask for user role and ensure the input is valid
        do{
            internationalization = r.getString("whichUser");
            System.out.println(internationalization);
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
                internationalization = r.getString("enterSN");
                System.out.println(internationalization);
                String sn = userInput.nextLine();
                
                internationalization = r.getString("enterTitle");
                System.out.println(internationalization);
                String title = userInput.nextLine();
                
                internationalization = r.getString("enterAuthor");
                System.out.println(internationalization);
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
            case 5:
                System.out.println("Thank you for using the Library Management System, you may close the program now.");
                break;
        }
    }
    
    public void studentControl() throws SQLException{
        StudentClass student = new StudentClass();
        view.viewOptionsStudent(student);
        
        int option = numberInput.nextInt();//whatever student enters as option will be read here
        
        //if user chooses wtv call model method
        switch(option){
            case 1: // search book by title
                System.out.println("Please enter the title of the book you are looking for: ");
                String title = userInput.nextLine();
                model.searchBookByTitle(title);
                break;
            case 2: // search book by author
                System.out.println("Please enter the name of the author you are looking for: ");
                String author = userInput.nextLine();
                model.searchBookByAuthor(author);
                break;
            case 3: // view entire catalogue
                model.viewBookCatalogue();
                break;
            case 4: // borrow a book
                System.out.println("Please enter id of this process: ");
                int id = numberInput.nextInt();
                System.out.println("Please enter sn of the book: ");
                String studentsn = userInput.nextLine();
                System.out.println("Please enter your student id: ");
                int studentId = numberInput.nextInt();
                System.out.println("Please enter today's date (YYYY): ");
                String issueDate = userInput.nextLine();
                model.issueBook(id, studentsn, studentId, issueDate);
                break;
            case 5: // return a book
                System.out.println("Please enter today's date (YYYY): ");
                String returnDate = userInput.nextLine();
                System.out.println("Please enter the book's serial number: ");
                String returnsn = userInput.nextLine();
                model.returnBook(returnDate, returnsn);
                break;
            case 6:
                System.out.println("Thank you for using the Library Management System, you may close the program now.");
                break;
        }
    }    
}
