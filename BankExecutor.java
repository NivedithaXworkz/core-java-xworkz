package com.workz.bankApp.service;
import com.workz.bankApp.dto.BankDto;
import com.workz.bankApp.service.BankServiceImpl;

import java.util.List;
public class BankExecutor {
    public static void main(String[] args) {
        BankServiceImpl service = new BankServiceImpl();
        BankDto dto = new BankDto(1, "Niveditha", 9611534934L, "Savings", "niveditha@gmail.com");
        BankDto dto1 = new BankDto(2, "Sneha", 4649543357L, "Fixed deposit", "sneha@gmail.com");
        BankDto dto2 = new BankDto(3, "Harshitha", 9865247284L, "Current", "harshitha@gmail.com");
        BankDto dto3 = new BankDto(4, "Lisha", 9443267964L, "NRI", "lisha@gamil.com");
        BankDto dto4 = new BankDto(5, "Shree", 7865359836L, "Bussiness", "shree@gmail.com");
        service.validateAndSave(dto1);
        BankDto id = service.findById(2);
        System.out.println(id);

        BankDto name = service.findByName("Niveditha");
        System.out.println(name);

        boolean updatedName = service.updateNameById(5, "Shreyas");
        System.out.println(updatedName);

        boolean deleted = service.deleteByName("Harshitha");
        System.out.println(deleted);

        List<BankDto> readData = service.readAll();
        for (BankDto dto5 : readData) {
            System.out.println(dto5);
        }
    }
}
