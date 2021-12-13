/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.util.ResourceBundle;

/**
 *
 * @author kalla
 */
public class LibrarianClass implements User{
    ResourceBundle r;//resource bundle
    String internationalization;//string that will hold which key needs to be fetched
    
    
    @Override
    public void displayOptions(){
        internationalization = r.getString("librarianDisplay1");
        System.out.println(internationalization);
        internationalization = r.getString("librarianDisplay2");
        System.out.println(internationalization);
        internationalization = r.getString("librarianDisplay3");
        System.out.println(internationalization);
        internationalization = r.getString("librarianDisplay4");
        System.out.println(internationalization);
        internationalization = r.getString("librarianDisplay5");
        System.out.println(internationalization);
        internationalization = r.getString("librarianDisplay6");
        System.out.println(internationalization);
    }
}
