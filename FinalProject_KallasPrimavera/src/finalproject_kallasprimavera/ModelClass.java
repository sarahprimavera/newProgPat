/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.sql.*;
import java.lang.Exception;
/**
 *
 * @author sarah
 */
//performs all calculations needed
//this is me adding smthing
public class ModelClass {
    
    public static Connection con;
    //stuff librarians needs to do
    public void addBook(String sn,String title,String author,String publisher,int quality,String addedDate){
        try{
            String insertBook = "INSERT INTO Books VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(insertBook);
            preparedStmt.setString (1, sn);
            preparedStmt.setString (2, title);
            preparedStmt.setString (3, author);
            preparedStmt.setString (4, publisher);
            preparedStmt.setString (5, String.valueOf(quality));
            preparedStmt.setString (6, addedDate);
            preparedStmt.execute();
        } catch(Exception e){
            System.out.println("Couldn't add book, something went wrong");
        }
        
    }
    public void issueBook(int id,String sn, int studentId,String issueDate,String returnDate){
            try{
            String insertIssuedBooks = "INSERT INTO IssuedBooks VALUES (?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(insertIssuedBooks);
            preparedStmt.setString (1, String.valueOf(id));
            preparedStmt.setString (2, sn);
            preparedStmt.setString (3, String.valueOf(studentId));
            preparedStmt.setString (4, issueDate);
            preparedStmt.setString (5, returnDate);
            preparedStmt.execute();
            
            //String removeQuantity = "UPDATE Books SET Quantity = -1 WHERE Books.SN = "; 
            //try to remove quantity of book by 1 since a book gets issues
        } catch(Exception e){
            System.out.println("Couldn't add to issues books table, something went wrong");
        }
    }
    public void viewIssueBookWithStudent() throws SQLException{
        String viewIssueBooks = "SELECT * FROM IssuedBooks";
        
        Statement stat = con.createStatement();
        ResultSet  result = stat.executeQuery(viewIssueBooks);
        
        String id;
        String sn;
        String studentId;
        String issueDate;
        String returnDate;
        //getting all the info from the table, will use this later to print it out to the user
        while (result.next()){
            id = result.getString("ID");
            sn = result.getString("SN");
            studentId = result.getString("StudentId");
            issueDate = result.getString("IssueDate");
            returnDate = result.getString("ReturnDate");
        }
    }
    
    //stuff sutdents need to do
    public void searchBookByTitle(String title) throws SQLException{
        String getBookByTitle = "SELECT * FROM Books WHERE Title = (?)";
        
        //inserts title parameter in the statement and eecutes it
        PreparedStatement preparedStmt = con.prepareStatement(getBookByTitle);
        preparedStmt.setString (1, title);
        preparedStmt.execute();
    }
    public void searchBookByAuthor(String author) throws SQLException{
        String searchBookByAuthor = "SELECT * FROM Books WHERE Author = (?)";
        
        //inserts author parameter in the statement and eecutes it
        PreparedStatement preparedStmt = con.prepareStatement(searchBookByAuthor);
        preparedStmt.setString (1, author);
        preparedStmt.execute();
    }
    public void viewBookCatalogue() throws SQLException{
        String viewBookCat = "SELECT * FROM Books";
        
        Statement stat = con.createStatement();
        ResultSet  result = stat.executeQuery(viewBookCat);
        
        String sn;
        String title;
        String author;
        String publisher;
        String quantity;
        String addedDate;
        //getting all the info from the table that will later be returned to user
        while (result.next()){
            sn = result.getString("SN");
            title = result.getString("Title");
            author = result.getString("Author");
            publisher = result.getString("Publisher");
            quantity = result.getString("Quantity");
            addedDate = result.getString("addedDate");
        }
    }
    public void borrowBook(int id,String sn,int studentId,String issueDate) throws SQLException{
        String addToIssueBook = "INSERT INTO IssuedBooks VALUES (?,?,?,?,?)";
        
        //adds in issued books info about the book being borrowed
        //since book is just getting borrowed, return date is null
        PreparedStatement preparedStmt = con.prepareStatement(addToIssueBook);
        preparedStmt.setString (1, String.valueOf(id));
        preparedStmt.setString (2, sn);
        preparedStmt.setString (3, String.valueOf(studentId));
        preparedStmt.setString (4, issueDate);
        preparedStmt.setString (5, null);
        preparedStmt.execute();
    }
    
    //stuff librarian and student need to do
    public void returnBook(String todayDate, String bookSN) throws SQLException{
        String removeFromIssuedBook = "UPDATE from IssueBooks SET ReturnDate = (?) WHERE SN = (?)";
        
        // adds a return date to the issuedbook thorugh the books sn
        PreparedStatement preparedStmt = con.prepareStatement(removeFromIssuedBook);
        preparedStmt.setString (1, todayDate);
        preparedStmt.setString (2, bookSN);
        preparedStmt.execute();
    }
}
