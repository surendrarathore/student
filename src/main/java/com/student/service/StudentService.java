package com.student.service;

import com.student.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public interface StudentService {
    StudentModel saveStudent(StudentModel studentModel);

}
