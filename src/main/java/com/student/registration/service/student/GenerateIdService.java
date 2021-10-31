package com.student.registration.service.student;

import com.student.registration.model.Student;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GenerateIdService {

    public String createStuId(Student student){
        String substringFirstName = student.getFirstName().substring(0, 3);
        String substringLastName = student.getLastName().substring(0, 3);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String format = formatter.format(date);
        String generatedId = String.join("", substringFirstName, substringLastName, format);
        return generatedId;
    }

}
