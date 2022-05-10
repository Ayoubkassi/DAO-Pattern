/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAO.Dao;
import Model.Student;
import Service.StudentDao;
import java.util.Optional;

/**
 *
 * @author ryota
 */
public class StudentController {
     private static Dao<Student> studentDao;

    public static void main(String[] args) {
        studentDao = new StudentDao();
        
        Student student1 = getStudent(0);
        System.out.println(student1);
        studentDao.update(student1, new String[]{"Ayoub Kassi", "ayoub@gmail.com","Computer Science"});
        
        Student student2 = getStudent(1);
        studentDao.delete(student2);
        studentDao.save(new Student("Maroua El Azzaoui", "maroua@gmail.com","Software Engineering"));
        
        studentDao.getAll().forEach(user -> System.out.println(user.getName()));
    }

    private static Student getStudent(long id) {
        Optional<Student> student = studentDao.get(id);
        
        return student.orElseGet(
          () -> new Student("non-existing user", "no-email","no Major"));
    }
}
