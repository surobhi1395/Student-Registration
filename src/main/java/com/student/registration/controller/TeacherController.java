package com.student.registration.controller;

import com.student.registration.dto.TeacherDto;
import com.student.registration.model.Teacher;
import com.student.registration.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @PostMapping("/teacher")
    public ResponseEntity<String> addNewTeacher(@RequestBody Teacher teacher){
        String addTeacher = teacherService.addTeacher(teacher);
        return ResponseEntity.ok().body(addTeacher);
    }

    @PutMapping("/teacherById")
    public ResponseEntity<String> updateTeacher(@RequestParam String teacherId){
        teacherService.updateTeacherData(teacherId);
        return ResponseEntity.ok().body("Success");
    }

    @GetMapping("/getTeachers")
    public List<TeacherDto> getAllTeacherData(){
      return teacherService.getTeachers();
    }

    @PostMapping("/addTeachers")
    public ResponseEntity<List<TeacherDto>> addTeachersList(@RequestBody List<Teacher> teacher){
        List<TeacherDto> teacherDtos = teacherService.addListOfTeacher(teacher);
        return ResponseEntity.ok().body(teacherDtos);
    }

}
