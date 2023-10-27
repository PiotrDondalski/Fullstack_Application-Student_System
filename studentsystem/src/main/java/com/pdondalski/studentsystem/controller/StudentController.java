package com.pdondalski.studentsystem.controller;

import com.pdondalski.studentsystem.model.Student;
import com.pdondalski.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student") //pozniej w postman'ie podaje sie ta sciezke w url
@CrossOrigin //polaczenie reacta i springboota z aplikacja
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add") //pozniej w postman'ie podaje sie ta sciezke w url
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student has been added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
