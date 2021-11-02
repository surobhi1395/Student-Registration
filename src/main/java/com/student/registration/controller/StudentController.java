package com.student.registration.controller;

import com.student.registration.dto.StudentDto;
import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import com.student.registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/student")
   public ResponseEntity<String> addStudentApi(@RequestBody Student student){
        //Student saved = studentService.addStudent(student);
        /* URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{studentClass}").buildAndExpand(saved.getStudentClass()).toUri();
       */
        //return ResponseEntity.ok().body(save);
        //return ResponseEntity.created(URI.create(String.format("/student/", student.getStudentClass()))).body(save);
        String s = studentService.addStudent(student);
        return ResponseEntity.ok().body(studentService.addStudent(student));
   }

   @PutMapping("/student")
   public ResponseEntity<Student> updateStudent(@RequestParam(name = "id") String studId,
                                               @RequestBody Student student){

       Student updateStudent = studentService.updateStudent(student);
       return ResponseEntity.ok().body(updateStudent);
       }



}
