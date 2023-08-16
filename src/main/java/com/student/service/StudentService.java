package com.student.service;

import com.student.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<StudentModel> stdList = new ArrayList<>();
    public List<StudentModel> getAllStudent(){
        stdList.add(new StudentModel("robin","singh","kota",101));
        stdList.add(new StudentModel("kushal","singh","ajmer",102));
        return stdList;
    }


    public StudentModel addStudent(StudentModel studentModel){
        //stdList.add(studentModel);
        //return stdList.add(studentModel) ? studentModel : null;
        if(stdList.add(studentModel)){
            return studentModel;
        }else{
            return null;
        }
    }
}
