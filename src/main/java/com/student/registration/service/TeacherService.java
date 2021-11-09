package com.student.registration.service;

import com.student.registration.model.Teacher;
import org.springframework.stereotype.Service;

public interface TeacherService {

   public String addTeacher(Teacher teacher);

   public void updateTeacherData(String teacherId);

}
