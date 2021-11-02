package com.student.registration.service;

import com.student.registration.model.Student;
import com.student.registration.model.UpdateStudent;

public interface StudentService {

   public String addStudent(Student student);

   public void updateStudent(Student student);
}
