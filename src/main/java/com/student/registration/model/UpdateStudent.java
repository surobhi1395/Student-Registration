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
public class UpdateStudent {

    @Id
    private String address;
    private String email;
    private Integer pinCode;
    private Integer phoneNumber;

}
