package com.student.controller;

import com.student.model.StudentModel;
import com.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentController {
    //@Autowired
    //private StudentService studentService;

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getallstudent")
    public List<StudentModel> getAllStudentData(){
        //return List.of(new StudentModel());
        return studentService.getAllStudent();
    }
}
