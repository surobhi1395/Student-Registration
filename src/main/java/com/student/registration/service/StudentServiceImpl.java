package com.student.registration.service;

import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import com.student.registration.service.student.GenerateIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student addStudent(Student student) {
        Student save = studentRepo.save(student);
        return save;
    }
}
