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
public class LibrarianClass implements User{
    @Override
    public void displayOptions(){
        String str = "";
        str += "\n" + "Please select one of the following options: ";
        str += "\n" + "\t" + "Enter 1 to add a book to the inventory,";
        str += "\n" + "\t" + "Enter 2 to issue a book,";
        str += "\n" + "\t" + "Enter 3 to return a book,";
        str += "\n" + "\t" + "Enter 4 to view the list of issued books.";
        System.out.println(str);
    }
}
