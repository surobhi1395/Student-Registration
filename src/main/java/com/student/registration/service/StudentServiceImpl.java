package com.student.registration.service;

import com.student.registration.dto.StudentDto;
import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import com.student.registration.service.student.StudentCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;

    private StudentCalculation studentCalculation;

    @Autowired
    public StudentServiceImpl(StudentCalculation studentCalculation) {
        this.studentCalculation = studentCalculation;
    }

    @Override
    public String addStudent(Student student) {
        //Student save = studentRepo.save(student);
        StudentDto dto = studentRepo.save(createStudentDto(student));

        return dto.getStudentId();
    }

    public StudentDto createStudentDto(Student student){
        return StudentDto.builder(
               ).address(student.getAddress())
                .StudentId(studentCalculation.createStuId(student))
                .email(student.getEmail())
                .pinCode(student.getPinCode())
                .mobileNumber(student.getMobileNumber())
                .fees(studentCalculation.calcDiscount(student))
                .studentClass(student.getStudentClass())
                .lastName(student.getLastName())
                .firstName(student.getFirstName())
                .build();
    }
}
