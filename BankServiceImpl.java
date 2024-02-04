package com.workz.bankApp.service;

import com.workz.bankApp.Reopsitory.BankRepoImpl;
import com.workz.bankApp.dto.BankDto;
//import com.workz.bankApp.repository.BankRepoImpl;

import java.util.List;
public class BankServiceImpl implements BankService {
    BankRepoImpl repository = new BankRepoImpl();

    @Override
    public boolean validateAndSave(BankDto dto) {
        if (dto.getId() > 0) {
            if (dto.getName() != null) {
                System.out.println("Let's Continue ");
                return repository.validateAndSave(dto);
            }
        }
        return false;
    }

    @Override
    public BankDto findById(int id) {
        if (id > 0) {
            System.out.println("Your id is valid ");
            return repository.findById(id);
        } else {
            System.out.println("Id is invalid");
        }
        return null;
    }


    @Override
    public BankDto findByName(String name) {
        if (name.length() > 2 && name != null) {
            System.out.println("Get the application");
            return repository.findByName(name);
        } else {
            System.out.println("Check the name you have entered");
        }
        return null;
    }

    @Override
    public boolean updateNameById(int id, String name) {
        if (id > 0) {
            System.out.println("Your name can be update");
            return repository.updateNameById(id, name);
        }
        return false;
    }

    @Override
    public boolean deleteByName(String name) {
        if (name != null) {
            System.out.println(" Now you can delete");
            return repository.deleteByName(name);
        }
        return false;
    }

    @Override
    public List<BankDto> readAll() {
        System.out.println("Now we are reading all the data");
        return repository.readAll();
    }
}

