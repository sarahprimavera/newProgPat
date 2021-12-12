/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author kalla
 */
public class Login {
    public static void login() {
        // Creating login JFrame
        JFrame frame = new JFrame("Login Page");   
        JLabel usernameLabel;  
        
        // Create label Username
        usernameLabel = new JLabel("Username: ");  
        usernameLabel.setBounds(30,15, 100,30); //x axis, y axis, width, height
     
        // Create text field for username
        JTextField usernameTextField = new JTextField(); 
        usernameTextField.setBounds(110, 15, 200, 30);
       
        // Creating a login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(229, 50, 80, 25);
        loginButton.addActionListener(new ActionListener() {  // Perform action - what happens when clicked
         
            public void actionPerformed(ActionEvent e){ 
                // Store username entered by the user in the username TextField
                String username = usernameTextField.getText();
         
                if(username.equals("")) { // If username is null
                    JOptionPane.showMessageDialog(null,"Please enter a username."); // Display dialog box
                } else if(username.equals("Admin") || username.equals("admin")){
                    // open librarian menu
                } else { // Check wether the user exists already
                    Connection connection = GetConnection.connect();  // Connect to the database
                    try
                    {
                        Statement stmt = connection.createStatement();
                        stmt.executeUpdate("USE LIBRARY"); // Use the database with the name "Library"
                        String st = ("SELECT * FROM Students WHERE StudentId = '" + username + "'"); //Retreive StudentId
                        ResultSet rs = stmt.executeQuery(st); //Execute query
                        if(rs.next()== false) { // Move pointer below
                            System.out.print("No user");  
                            JOptionPane.showMessageDialog(null, "This Student ID is invalid. Please try again."); //Display Message
                        } else {
                            // DONT KNOW WHAT TO DO IF STUDENT EXISTS -- must connect by using connect() and then they can press buttons?
                        }
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }               
        });
 
     
        // Adding items to the Jframe
        frame.add(usernameLabel);
        frame.add(usernameTextField);
        frame.add(loginButton);
        
        // Sizing and displaying the JFrame
        frame.setSize(400,180);//400 width and 180 height  
        frame.setLayout(null);//using no layout managers  
        frame.setVisible(true);//making the frame visible 
        frame.setLocationRelativeTo(null);
    }
}
