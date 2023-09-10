package com.student.service.impl;

import com.student.model.StudentModel;
import com.student.pojo.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    @Override
    public StudentModel saveStudent(StudentModel studentModel) {
        Student student = new Student();
        student.setCity(studentModel.getCity());
        student.setFirstName(studentModel.getFirstName());
        student.setLastName(studentModel.getLastName());
        student.setRollNo(studentModel.getRollNo());
        student =  studentRepository.save(student);
        return studentModel;
    }
    @Transactional
    @Override
    public List<StudentModel> getAllStudentModel() {
       List<Student> studentList =  studentRepository.findAll();
        List<StudentModel> studentModelList  =  studentList.stream().map(student->{
            StudentModel studentModel = new StudentModel();
            studentModel.setLastName(student.getLastName());
            studentModel.setCity(student.getCity());
            studentModel.setFirstName(student.getFirstName());
            studentModel.setRollNo(student.getRollNo());
            return studentModel;
        }).toList();

       /*List<StudentModel> studentModelList  = new ArrayList<>();
       for(Student student :studentList){
           StudentModel studentModel = new StudentModel();
           studentModel.setLastName(student.getLastName());
           studentModel.setCity(student.getCity());
           studentModel.setFirstName(student.getFirstName());
           studentModel.setRollNo(student.getRollNo());
           studentModelList.add(studentModel);
       }*/
        return studentModelList;
    }
}
