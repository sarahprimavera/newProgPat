/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

/**
 *
 * @author kalla
 */
public class UserFactory {
    public User getUser(String userType){
        if(userType.equalsIgnoreCase("Librarian")){
            return new LibrarianClass();
        } else if(userType.equalsIgnoreCase("Student")){
            return new StudentClass();
        } else {
            System.out.println("Invalid response, please type in \"student\" or "
                    + "\"librarian\"");
            return null;
        }
    }
    
}
