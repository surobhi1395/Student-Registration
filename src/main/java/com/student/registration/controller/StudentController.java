package com.student.registration.controller;

import com.student.registration.model.Student;
import com.student.registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
   public ResponseEntity<Student> addStudentApi(@RequestBody Student student){
        //Student saved = studentService.addStudent(student);
        /* URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{studentClass}").buildAndExpand(saved.getStudentClass()).toUri();
       */

        Student save = studentService.addStudent(student);
        //return ResponseEntity.ok().body(save);
        return ResponseEntity.created
                (URI.create(String.format("/student/", student.getStudentClass()))).body(save);

   }

}
