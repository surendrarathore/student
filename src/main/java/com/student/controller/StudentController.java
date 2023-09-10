package com.student.controller;

import com.student.model.StudentModel;
import com.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/getallstudent")
    public List<StudentModel> getAllStudentData(){
        //return List.of(new StudentModel());
        return null;
    }

    @PostMapping("/addstudent")
    public StudentModel addStudent(@RequestBody StudentModel studentModel){
        return studentService.saveStudent(studentModel);
    }
    @PutMapping("/updatestudent")
    public StudentModel updateStudent(@RequestBody StudentModel studentModel){
            return null;
    }
    @DeleteMapping("/deletestudent/{rollNumber}")
    public String deleteStudent(@PathVariable Integer rollNumber){
            return null;
    }
}
