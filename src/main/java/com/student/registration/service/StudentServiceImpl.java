package com.student.registration.service;

import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student addStudent(Student student) {
        Student save = studentRepo.save(student);
        /* String substringFirstName = student.getFirstName().substring(0, 2);
        String substringLastName = student.getLastName().substring(0, 2);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy");
        String join = String.join("", substringFirstName, substringLastName, (CharSequence) format);
        */
        return save;

    }
}
