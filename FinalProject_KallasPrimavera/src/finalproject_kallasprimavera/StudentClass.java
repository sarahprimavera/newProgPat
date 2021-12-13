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
public class StudentClass implements User{    
    ResourceBundle r;//resource bundle
    String internationalization;//string that will hold which key needs to be fetched
    
    @Override
    public void displayOptions(){
        
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
