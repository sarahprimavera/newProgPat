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
        str += "\n" + "\t" + "addBook";
        str += "\n" + "\t" + "issueBook";
        str += "\n" + "\t" + "returnBook";
        str += "\n" + "\t" + "viewIssuedBook";
        System.out.println(str);
    }
}
