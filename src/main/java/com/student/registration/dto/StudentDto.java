package com.student.registration.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentDto {

    @Id
    private Integer StudentId;
    private String lastName;
    private String address;
    private Integer pinCode;
    private Long mobileNumber;
    private String email;
    private Integer studentClass;
    private Integer fees;

}
