/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import DAO.Dao;
import Model.Student;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 *
 * @author ryota
 */
public class StudentDao implements Dao<Student>{
    private final List<Student> students = new ArrayList<>();
    
    //Constructor
    public StudentDao() {
        students.add(new Student("Ayoub", "ayoub@gmail.com","Computer Science"));
        students.add(new Student("Maroua", "maroua@gmail.com", "Software Engineering"));
    }
    
    @Override
    public Optional<Student> get(long id) {
        return Optional.ofNullable(students.get((int) id));
    }
    
    @Override
    public List<Student> getAll() {
        return students;
    }
    
    @Override
    public void save(Student user) {
        students.add(user);
    }
    
    @Override
    public void update(Student student, String[] params) {
        student.setName(Objects.requireNonNull(
          params[0], "Name cannot be null"));
        student.setEmail(Objects.requireNonNull(
          params[1], "Email cannot be null"));
        student.setMajor(Objects.requireNonNull(
          params[1], "Major cannot be null"));
        
        students.add(student);
    }
    
    @Override
    public void delete(Student student) {
        students.remove(student);
    }
}
