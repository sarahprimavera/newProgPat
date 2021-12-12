/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

import java.sql.Connection;


/**
 *
 * @author kalla
 */
public class Book {
    // Create necessary variables that are datamembers in the books table
    private String serialNumber;
    private String title;
    private String author;
    private String publisher;
    private int quantity;
    private String addedDate;
    static Connection con;

    // Create a constructor for the class
    public Book(String serialNumber, String title, String author, String publisher,
                int quantity, String addedDate) {
        this.serialNumber = serialNumber;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.addedDate = addedDate;
    }
    
    // Getter for the serialNumber variable
    public String getserialNumber() {
        return serialNumber;
    }

    // Getter for the title variable
    public String getTitle() {
        return title;
    }

    // Getter for the author variable
    public String getAuthor() {
        return author;
    }

    // Getter for the publisher variable
    public String getPublisher() {
        return publisher;
    }

    // Getter for the quantity variable
    public int getQuantity() {
        return quantity;
    }

    // Getter for the addedDate variable
    public String getAddedDate() {
        return addedDate;
    }
}
