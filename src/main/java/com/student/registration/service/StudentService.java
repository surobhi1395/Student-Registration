package com.student.registration.service;

import com.student.registration.dto.StudentDto;
import com.student.registration.model.Student;

public interface StudentService {

   public String addStudent(Student student);

   public Student updateStudent(Student student);
}
