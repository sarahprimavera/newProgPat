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
public class Student {
    // Create variables for all the Datamembers in the student table
    private int studentId;
    private String name;
    private String contact;

    // Create constructor
    public Student(int studentId, String name, String contact) {
        this.studentId = studentId;
        this.name = name;
        this.contact = contact;
    }
    
    // Getter for studentId variable
    public int getStudentId() {
        return studentId;
    }

    // Getter for name variable
    public String getName() {
        return name;
    }

    // Getter for contact variable
    public String getContact() {
        return contact;
    }
}
