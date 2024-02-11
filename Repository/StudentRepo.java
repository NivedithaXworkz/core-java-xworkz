package com.xworkz.stu.Repository;
import com.xworkz.stu.dto.StudentDto;
public interface StudentRepo {
    public boolean validateAndAdd(StudentDto dto);
    public StudentDto findByName(String name);
    public boolean updateNameById( int id,String name) ;
    public boolean deleteByName(String name);
}
