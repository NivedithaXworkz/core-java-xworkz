package com.xworkz.stu.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table

public class StudentDto {
    @Id
    private  int id;
    private String name;
    private String email;
    //private String usn;

}
