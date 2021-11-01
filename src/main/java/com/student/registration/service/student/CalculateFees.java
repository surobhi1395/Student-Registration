package com.student.registration.service.student;

import com.student.registration.model.Student;

public class CalculateFees {

    int fees;
    public Integer calcFee(Student student){
        if(student.getStudentClass()>=1 && student.getStudentClass()<=5){
            fees = 5000;
        }
        if(student.getStudentClass()>=6 && student.getStudentClass()<=8){
            fees = 8000;
        }
        if(student.getStudentClass()>=9 && student.getStudentClass()<=12){
            fees = 10000;
        }
        return fees;
    }

}
