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
public class StudentClass implements User{    
    ResourceBundle r;//resource bundle
    String internationalization;//string that will hold which key needs to be fetched
    String lang;
     //constructor that takes in the language
    public StudentClass(String lang){
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
        internationalization = r.getString("studentDisplay1");
        System.out.println(internationalization);
        internationalization = r.getString("studentDisplay2");
        System.out.println(internationalization);
        internationalization = r.getString("studentDisplay3");
        System.out.println(internationalization);
        internationalization = r.getString("studentDisplay4");
        System.out.println(internationalization);
        internationalization = r.getString("studentDisplay5");
        System.out.println(internationalization);
        internationalization = r.getString("studentDisplay6");
        System.out.println(internationalization);
        internationalization = r.getString("studentDisplay7");
        System.out.println(internationalization);
    }
}
