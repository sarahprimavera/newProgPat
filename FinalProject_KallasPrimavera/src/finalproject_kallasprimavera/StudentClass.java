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
        str += "\n" + "\t" + "searchBookByTitle";
        str += "\n" + "\t" + "searchBookByAuthor";
        str += "\n" + "\t" + "viewCatalogue";
        str += "\n" + "\t" + "borrowBook";
        str += "\n" + "\t" + "returnBook";
        System.out.println(str);
    }
}
