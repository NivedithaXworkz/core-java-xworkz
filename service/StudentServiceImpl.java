package com.xworkz.stu.service;

import com.xworkz.stu.Repository.StudentRepo;
import com.xworkz.stu.Repository.StudentRepoImpl;
import com.xworkz.stu.dto.StudentDto;

public class StudentServiceImpl implements StudentService {
    private StudentRepo repo = new StudentRepoImpl();


    @Override
    public boolean validateAndAdd(StudentDto dto) {
        if (dto != null) {
            if (dto.getName() != null && dto.getName().length() > 3) {
                if (dto.getId() > 0) {
                    if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
                        System.out.println("Print student details");
                        return repo.validateAndAdd(dto);
                    }
                }
            }
        }
        return false;
    }

    public StudentDto findByName(String name) {
if(name!=null && name.isEmpty()){
    System.out.println("Check the name you have entered");
    return repo.findByName(name);
}
        return null;
    }
    public boolean updateNameById(int id, String name) {
        if (id > 0) {
            System.out.println("Your name can be update");
            return repo.updateNameById(id, name);
        }
        return false;
    }
        public boolean deleteByName(String name){
        if(name!=null && !name.isEmpty()){
            return repo.deleteByName(name);
        }
        return false;
    }
    }









