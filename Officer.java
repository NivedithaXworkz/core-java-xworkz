package com.xworkz.officer;
import lombok.*;
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Officer {
    private int officerId;
    private String name;
    private String postName;
    private int age;
    private String gender;
    private String bloodGroup;
    private String address;
}
