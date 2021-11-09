package com.student.registration.controller;

import com.student.registration.dto.StudentDto;
import com.student.registration.model.Student;
import com.student.registration.repository.StudentRepo;
import com.student.registration.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
   public ResponseEntity<String> updateStudent(@RequestParam(name = "id") String studId,
                                                @RequestBody Student student){
       studentService.updateStudent(student);
       return ResponseEntity.ok("Success");
       }

   @GetMapping("/student")
   public List<StudentDto> getAllStudent(){
        return studentService.getStudent();
   }

   @PostMapping("/addAllStudent")
   public ResponseEntity<List<StudentDto>> addAllStudents(@RequestBody List<Student> students){
       List<StudentDto> addAllStudents = studentService.addAllStudents(students);
       return ResponseEntity.ok().body(addAllStudents);
   }

   @PutMapping("/updateStudentFees")
   public ResponseEntity<String> updateStudentById(@RequestParam(name = "id") String studId,
                                                   @RequestParam(name = "feesPaid") Integer fees){
       studentService.updateStudentFees(studId, fees);
       return ResponseEntity.ok("Success");
   }



}
