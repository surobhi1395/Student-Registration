package com.student.registration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Teacher {

    @Id
    private String teacherFirstName;
    private String teacherLastName;
    private Integer age;
    private Integer salary;
    private String address;
    private Integer mobileNumber;
    private String email;
    private String subject;

}
