package com.student.registration.service;

import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public String addStudent(Student student) {
        Student save = studentRepo.save(student);
        return null;
    }
}
