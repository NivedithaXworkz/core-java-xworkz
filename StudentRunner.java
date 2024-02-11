package com.xworkz.stu;

import com.xworkz.stu.dto.StudentDto;
import com.xworkz.stu.service.StudentService;
import com.xworkz.stu.service.StudentServiceImpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentRunner {
    public static void main(String[] args) {
        StudentService service = new StudentServiceImpl();
        StudentDto dto = new StudentDto(1,"niveditha","nivi@gmail.com");
        StudentDto dto1 = new StudentDto(2,"Shreyas","justin@gmail.com");
        StudentDto dto2 = new StudentDto(3,"Lisha","lisha@gamil.com");
        StudentDto dto3 = new StudentDto(4,"Sneha","sneha@gmail.com");
        StudentDto dto4 = new StudentDto(5,"Veda","veda@gmail.com");
       service.validateAndAdd(dto4);
        boolean result = service.validateAndAdd(dto);
        System.out.println(result);
       StudentDto foundDto = service.findByName("Lisha");
       System.out.println(foundDto);
        //boolean result = service.updateNameById(4,"Heera");
      // System.out.println(result);
        //boolean result = service.deleteByName("Veda");
        //System.out.println(result);
    }
}
