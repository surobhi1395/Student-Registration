package com.student.registration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Student {

    @Id
    private String firstName;
    private String lastName;
    private String address;
    private Integer pinCode;
    private Long mobileNumber;
    private String email;
    private Integer studentClass;

}
