package com.student.registration.service;

import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import com.student.registration.service.studentId.GenerateIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private GenerateIdService generateIdService;

    @Override
    public Student addStudent(Student student) {
        String stuId = generateIdService.createStuId(student);
        Student save = studentRepo.save(student);
        return save;

    }
}
