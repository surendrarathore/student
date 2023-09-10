package com.student.service.impl;

import com.student.model.StudentModel;
import com.student.pojo.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
