/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject_kallasprimavera;

/**
 *
 * @author kalla
 */
public class StudentClass implements User{
    @Override
    public void displayOptions(){
        String str = "";
        str += "\n" + "Please select one of the following options: ";
        str += "\n" + "\t" + "Enter 1 to search a book title by it's title,";
        str += "\n" + "\t" + "Enter 2 to search a book title by it's author,";
        str += "\n" + "\t" + "Enter 3 to view the book catalogue,";
        str += "\n" + "\t" + "Enter 4 to borrow a book,";
        str += "\n" + "\t" + "Enter 5 to return a book.";
        str += "\n" + "\t" + "Enter 6 to exit.";
        System.out.println(str);
    }
}
