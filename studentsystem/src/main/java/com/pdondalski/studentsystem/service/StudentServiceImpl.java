package com.pdondalski.studentsystem.service;

import com.pdondalski.studentsystem.model.Student;
import com.pdondalski.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student); //zapisywanie studenta do bazy danych
    }

    @Override
    public List<Student> getAllStudents() { //znajdywanie studenta w bazie danych
        return studentRepository.findAll();
    }
}
