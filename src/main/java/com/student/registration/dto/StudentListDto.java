package com.student.registration.dto;

import com.student.registration.model.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class StudentListDto {

    private List<Student> studentList;

    public StudentListDto() {
        studentList = new ArrayList<>();
    }

}
