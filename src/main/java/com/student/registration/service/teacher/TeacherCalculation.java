package com.student.registration.service.teacher;

import com.student.registration.model.Teacher;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TeacherCalculation {

    public String createTeacherId(Teacher teacher){
        String firstName = teacher.getTeacherFirstName().substring(0, 3);
        String lastName = teacher.getTeacherLastName().substring(0, 3);
        String age = teacher.getAge().toString();
        String mobileNumber = teacher.getMobileNumber().toString().substring(0, 4);
        String subject = teacher.getSubject().substring(0, 3);
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy");
        String format = formatter.format(date);
        String teacherId = String.join("", firstName, lastName, age,
                mobileNumber, subject, format);
        return teacherId;
    }

    

}
