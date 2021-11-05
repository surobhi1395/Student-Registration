package com.student.registration.service;

import com.student.registration.dto.StudentDto;
import com.student.registration.model.Student;

import java.util.List;

public interface StudentService {

   public String addStudent(Student student);

   public void updateStudent(Student student);

   public List<StudentDto> getStudent();

}
