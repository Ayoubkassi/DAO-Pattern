/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ryota
 */
public class Student {
    private String name;
    private String email;
    private String major;
    
    //Constructor 

    public Student(String name, String email, String major) {
        this.name = name;
        this.email = email;
        this.major = major;
    }
    
    //ecmpty constuctor

    public Student() {
    }
    
    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    //to string

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", email=" + email + ", major=" + major + '}';
    }
    
    
}
