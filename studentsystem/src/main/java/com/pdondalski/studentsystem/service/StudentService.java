package com.pdondalski.studentsystem.service;

import com.pdondalski.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student); //zapisywanie studenta do bazy danych
    public List<Student> getAllStudents();
}
