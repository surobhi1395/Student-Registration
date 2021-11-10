package com.student.registration.service;

import com.student.registration.dto.TeacherDto;
import com.student.registration.model.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TeacherService {

   public String addTeacher(Teacher teacher);

   public void updateTeacherData(String teacherId);

   public List<TeacherDto> getTeachers();

   public List<TeacherDto> addListOfTeacher(List<Teacher> teacherList);

}
