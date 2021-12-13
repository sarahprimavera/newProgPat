/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author kalla
 */
public class LibrarianClass implements User{
    ResourceBundle r;//resource bundle
    String internationalization;//string that will hold which key needs to be fetched
    String lang;
    //constructor that takes in the language
    public LibrarianClass(String lang){
        this.lang= lang;
    }
    //method to get the language of user and set the resource bundle
    public void getLang(){
        if(lang.equals("en")){
            Locale locale = new Locale("en","CA");
            r = ResourceBundle.getBundle("FinalProject_KallasPrimavera/Bundle",locale);
        }else {
            Locale locale = new Locale("fr","CA");
            r = ResourceBundle.getBundle("FinalProject_KallasPrimavera/Bundle_fr_CA",locale);
        }
    }
    @Override
    public void displayOptions(){
        getLang();
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
