package com.student.registration.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class TeacherDto {

    @Id
    private String teacherId;
    private String teacherFirstName;
    private String teacherLastName;
    private Integer age;
    private Integer salary;
    private String address;
    private Integer mobileNumber;
    private String subject;

}
