package com.student.registration.service.student;

import com.student.registration.dto.StudentDto;
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

    public Integer calcDiscount(Student student){
       int d1 = calcFee(student);
       int d2 = student.getDiscount();
       int discount = d1-(d1*d2/100);
       return discount;
    }

    public void lastFeesDate(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        simpleDateFormat.format(date);
    }
}
