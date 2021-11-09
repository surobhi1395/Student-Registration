package com.student.registration.service;

import com.student.registration.dto.StudentDto;
import com.student.registration.exception.StudentNotFoundException;
import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import com.student.registration.service.student.StudentCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {

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

    public StudentDto createStudentDto(Student student) {
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
                .discount(student.getDiscount())

                .build();
    }

    @Override
    public void updateStudent(Student student) {

        StudentDto studentDetails = studentRepo.getById(studentCalculation.createStuId(student));
        if (ObjectUtils.isEmpty(studentDetails)) {
            throw new RuntimeException("Student Id Not Found");
        }
        studentDetails.setAddress(student.getAddress());
        studentDetails.setPinCode(student.getPinCode());
        studentDetails.setMobileNumber(student.getMobileNumber());
        studentDetails.setEmail(student.getEmail());

        StudentDto save = studentRepo.save(studentDetails);

    }

    @Override
    public List<StudentDto> getStudent() {
        return studentRepo.findAll();
    }

    @Override
    public List<StudentDto> addAllStudents(List<Student> students) {
        List<StudentDto> studentDtos = studentRepo.saveAll(addListOfStudents(students));
        return studentDtos;
    }

    private List<StudentDto> addListOfStudents(List<Student> studentListDto) {
        return studentListDto.stream().map(student -> {
            return StudentDto.builder()
                    .address(student.getAddress())
                    .StudentId(studentCalculation.createStuId(student))
                    .email(student.getEmail())
                    .pinCode(student.getPinCode())
                    .mobileNumber(student.getMobileNumber())
                    .fees(studentCalculation.calcDiscount(student))
                    .studentClass(student.getStudentClass())
                    .lastName(student.getLastName())
                    .firstName(student.getFirstName())
                    .discount(student.getDiscount())
                    .build();
        }).collect(Collectors.toList());
    }

    public void updateStudentFees(String stuId, Integer fees) {
        StudentDto byId = studentRepo.getById(stuId);
        if(ObjectUtils.isEmpty(byId)) {
            throw new StudentNotFoundException("Student Id Not Found !");
        }else
            byId.setFeesPaid(fees);
            byId.setFeesRemaining(byId.getFees()-fees);
            studentRepo.save(byId);
    }

}