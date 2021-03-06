package com.student.registration.service;

import com.student.registration.dto.StudentDto;
import com.student.registration.model.Student;
import com.student.registration.model.Teacher;

import java.util.List;

public interface StudentService {

   public String addStudent(Student student);

   public void updateStudent(Student student);

   public List<StudentDto> getStudent();

   public List<StudentDto> addAllStudents(List<Student> students);

   public void updateStudentFees(String stuId, Integer fees);

}
