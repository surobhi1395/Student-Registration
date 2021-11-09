package com.student.registration.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class StudentDto {

    @Id
    private String StudentId;
    private String firstName;
    private String lastName;
    private String address;
    private Integer pinCode;
    private Long mobileNumber;
    private String email;
    private Integer studentClass;
    private Integer fees;
    private Integer discount;
    private Integer feesPaid;
    private Integer feesRemaining;

}
