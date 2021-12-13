/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.sql.*;
import java.lang.Exception;
import java.util.ResourceBundle;
/**
 *
 * @author sarah
 */
//performs all calculations needed
//this is me adding smthing
public class ModelClass {
    
    public static Connection con;
    GetConnection connectDb = new GetConnection();
    
    ResourceBundle r;//resource bundle
    String internationalization;//string that will hold which key needs to be fetched
    
    private String sn;
    private String title;
    private String author;
    private String publisher;
    private int quantity;
    private String addedDate;

    public ModelClass(){
        
    }
    
    public ModelClass(String sn, String title, String author, String publisher, int quantity, String addedDate) {
        this.sn = sn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.addedDate = addedDate;
    }
    
    public String getsn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }
    
    
    //stuff librarians needs to do
    public void addBook(String sn,String title,String author,String publisher,int quantity,String addedDate){
        try{
            con = connectDb.getSingleInstance();
            String insertBook = "INSERT INTO Books VALUES (?,?,?,?,?,?)";
            PreparedStatement preparedStmt = con.prepareStatement(insertBook);
            preparedStmt.setString (1, sn);
            preparedStmt.setString (2, title);
            preparedStmt.setString (3, author);
            preparedStmt.setString (4, publisher);
            preparedStmt.setString (5, String.valueOf(quantity));
            preparedStmt.setString (6, addedDate);
            preparedStmt.execute();
        } catch(Exception e){
            System.out.println("Couldn't add book, something went wrong " + e);
        }
        
    }
    public void issueBook(int id,String sn, int studentId,String issueDate){
            try{
                con = connectDb.getSingleInstance();
                String insertIssuedBooks = "INSERT INTO IssuedBooks VALUES (?,?,?,?,?)";
                PreparedStatement preparedStmt = con.prepareStatement(insertIssuedBooks);
                preparedStmt.setString (1, String.valueOf(id));
                preparedStmt.setString (2, sn);
                preparedStmt.setString (3, String.valueOf(studentId));
                preparedStmt.setString (4, issueDate);
                preparedStmt.setString (5, null);//is null because book just got issued
                preparedStmt.execute();
            
            //String removeQuantity = "UPDATE Books SET Quantity = -1 WHERE Books.SN = "; 
            //try to remove quantity of book by 1 since a book gets issued
        } catch(Exception e){
            internationalization = r.getString("addIssuedBookError");
            System.out.println(internationalization + e);
        }
    }
    //don't need this because already displaying issuedbooks table in view class
    public void viewIssueBookWithStudent(){
        try{
            con = connectDb.getSingleInstance();
            String viewIssueBooks = "SELECT * FROM IssuedBooks";

            Statement stat = con.createStatement();
            ResultSet  result = stat.executeQuery(viewIssueBooks);

            String id;
            String sn;
            String studentId;
            String issueDate;
            String returnDate;
            while (result.next()){
                id = result.getString("ID");
                sn = result.getString("SN");
                studentId = result.getString("StudentId");
                issueDate = result.getString("IssueDate");
                returnDate = result.getString("ReturnDate");
        }
        }catch (Exception e){
            internationalization = r.getString("viewIssuedBookError");
            System.out.println(internationalization + e);
        }
    }
    
    //stuff sutdents need to do
    public void searchBookByTitle(String title){
        try{
            con = connectDb.getSingleInstance();
            String getBookByTitle = "SELECT * FROM Books WHERE Title = (?)";

            //inserts title parameter in the statement and eecutes it
            PreparedStatement preparedStmt = con.prepareStatement(getBookByTitle);
            preparedStmt.setString (1, title);
            //preparedStmt.execute();
            ResultSet rs = preparedStmt.executeQuery();

            while(rs.next()){
                String sn = rs.getString("SN");
                String title2 = rs.getString("Title");
                String author = rs.getString("Author");
                String publisher = rs.getString("Publisher");
                int quantity = rs.getInt("Quantity");
                String addedDate = rs.getString("AddedDate");
                System.out.println(sn +" | "+title2+" | "+author+" | "+publisher+" | "+quantity+" | "+addedDate);
        }}
        catch (Exception e){
            internationalization = r.getString("searhByTitleError");
            System.out.println(internationalization + e);
        }
    }
    public void searchBookByAuthor(String author){
        try{
            con = connectDb.getSingleInstance();
            String searchBookByAuthor = "SELECT * FROM Books WHERE Author = (?)";

            //inserts author parameter in the statement and executes it
            PreparedStatement preparedStmt = con.prepareStatement(searchBookByAuthor);
            preparedStmt.setString (1, author);
            //preparedStmt.execute();
            ResultSet rs = preparedStmt.executeQuery();

            while(rs.next()){
                String sn = rs.getString("SN");
                String title = rs.getString("Title");
                String author2 = rs.getString("Author");
                String publisher = rs.getString("Publisher");
                int quantity = rs.getInt("Quantity");
                String addedDate = rs.getString("AddedDate");
                System.out.println(sn +" | "+title+" | "+author2+" | "+publisher+" | "+quantity+" | "+addedDate);
        }}
        catch (Exception e){
            internationalization = r.getString("searhByAuthorError");
            System.out.println(internationalization + e);
        }
    }
    public void viewBookCatalogue(){
        try{
            con = connectDb.getSingleInstance();
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
        }}
        catch(Exception e){
            internationalization = r.getString("viewCatalogueError");
            System.out.println(internationalization + e);
        }
    }
    public void borrowBook(int id,String sn,int studentId,String issueDate){
        try{
            con = connectDb.getSingleInstance();
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
        }catch(Exception e){
            internationalization = r.getString("borrowBookError");
            System.out.println(internationalization + e);
        }
    }     
    
    
    //stuff librarian and student need to do
    public void returnBook(String todayDate, String bookSN){
        try{
            con = connectDb.getSingleInstance();
            String removeFromIssuedBook = "UPDATE from IssueBooks SET ReturnDate = (?) WHERE SN = (?)";

            // adds a return date to the issuedbook thorugh the books sn
            PreparedStatement preparedStmt = con.prepareStatement(removeFromIssuedBook);
            preparedStmt.setString (1, todayDate);
            preparedStmt.setString (2, bookSN);
            preparedStmt.execute();
        }catch(Exception e){
            internationalization = r.getString("returnBookError");
            System.out.println(internationalization + e);
        }
    }
}
