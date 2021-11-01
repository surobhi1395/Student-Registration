package com.student.registration.service.student;

import com.student.registration.model.Student;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class StudentCalculation {

    public String createStuId(Student student){
        String substringFirstName = student.getFirstName().substring(0, 3);
        String substringLastName = student.getLastName().substring(0, 3);
        String mobileNumber = student.getMobileNumber().toString().substring(0, 4);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String format = formatter.format(date);
        String generatedId = String.join("", substringFirstName, substringLastName,
                mobileNumber, format);
        return generatedId;
    }

    public Integer calcFee(Student student){
        if(student.getStudentClass()>=1 && student.getStudentClass()<=5){
            return 5000;
        }
        if(student.getStudentClass()>=6 && student.getStudentClass()<=8){
            return 8000;
        }
        if(student.getStudentClass()>=9 && student.getStudentClass()<=12){
            return 10000;
        }
        return 0;
    }
}
