package com.student.registration.controller;

import com.student.registration.model.Teacher;
import com.student.registration.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

}
