/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kalla
 */
//view of all of the tables
public class ViewClass {
    public static Connection con;
    
     public void viewOptionsStudent(StudentClass student){
        student.displayOptions();
    }
    public void viewOptionsLibrarian(LibrarianClass librarian){
        librarian.displayOptions();
    }
    
    //prints out data for book table
    public void bookTable() throws SQLException{
        String book = "SELECT * FROM Books";
            
        Statement stat = con.createStatement();
        ResultSet  result = stat.executeQuery(book);
        
        while (result.next()){
            String sn = result.getString("SN");
            String title = result.getString("Title");
            String author = result.getString("Author");
            String publisher = result.getString("Publisher");
            String quantity = result.getString("Quantity");
            String addedDate = result.getString("AddedDate");
            
            System.out.println(sn+" | "+title+" | "+author+" | "+publisher+" | "+quantity+" | "+addedDate);
        }
    }
    
    //prints out data for issue books table
    public void issueBooksTable() throws SQLException{
        String issueBooks = "SELECT * FROM IssuedBooks";
        
        Statement stat = con.createStatement();
        ResultSet  result = stat.executeQuery(issueBooks);
        
        while (result.next()){
            String id = result.getString("ID");
            String sn = result.getString("SN");
            String studentId = result.getString("StudentId");
            String issueDate = result.getString("IssueDate");
            String returnDate = result.getString("ReturnDate");
            
            System.out.println(id+" | "+sn+" | "+studentId+" | "+issueDate+" | "+returnDate);
        }
    }
    
    //prints out data for student table (isn't really needed but nice to have)
    public void studentTable() throws SQLException{
        String issueBooks = "SELECT * FROM Students";
        
        Statement stat = con.createStatement();
        ResultSet  result = stat.executeQuery(issueBooks);
        
        while (result.next()){
            String studentId = result.getString("StudentId");
            String name = result.getString("Name");
            String contact = result.getString("Contact");
            
            System.out.println(studentId+" | "+name+" | "+contact);
        }
    }
}
