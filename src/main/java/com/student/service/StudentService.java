package com.student.service;

import com.student.model.StudentModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class StudentService {
    private List<StudentModel> stdList = new ArrayList<>();

    public StudentService(){
        stdList.add(new StudentModel("robin","singh","kota",101));
        stdList.add(new StudentModel("kushal","singh","ajmer",102));
    }
    public List<StudentModel> getAllStudent(){
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

    public StudentModel updateStudent(StudentModel studentModel){
        for (StudentModel std: stdList) {
            if(Objects.equals(std.getRollNo(), studentModel.getRollNo())){
                std.setCity(studentModel.getCity());
                std.setFirstName(studentModel.getFirstName());
                std.setLastName(studentModel.getLastName());
            }
        }
        return studentModel;
    }

    public String deleteStudent(Integer rollNumber){
       /* StudentModel deleteStd = null;
        for(StudentModel std: stdList){
            if(std.getRollNo().equals(rollNumber)){
                deleteStd = std;
                break;
            }
        }
      boolean res =   stdList.remove(deleteStd);*/

        boolean res =  stdList.removeIf(std->std.getRollNo().equals(rollNumber));

      if(res){
          return "success";
      }else {
          return "fail";
      }
    }

}
