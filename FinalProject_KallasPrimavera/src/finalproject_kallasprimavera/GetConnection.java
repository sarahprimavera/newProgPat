/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author kalla
 */
public class GetConnection {
    public static Connection con;
    
    //construtor that when object is created, getSingleInstance is called
    public GetConnection(){
        //getSingleInstance();
    }
    // Create single instance for Singleton Design Pattern 
    public Connection getSingleInstance(/*Exception ex*/){
        if(con == null){
            connect();
        } 
        return con;
    }
    
    public static Connection connect()
    {
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver"); // give it a name 
            //con = DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\kalla\\Desktop\\Prog Patterns\\Assignments\\Final Project\\FinalProject_Database.db");
            con = DriverManager.getConnection("jdbc:sqlite:/C:\\Users\\sarah\\OneDrive\\Documents\\GitHub\\newProgPat\\FinalProject_Database.db"); //sarah's url
            return con;
        } 
        catch (Exception e) { // Check if it is actually connecting
            System.out.println("Error connecting to SQLite database.");
            e.printStackTrace();
        }
    return null;
    }
}
