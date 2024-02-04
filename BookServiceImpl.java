package com.xworkz.book.service;
import com.xworkz.book.Repository.BookRepoImpl;
import com.xworkz.book.dto.BookDto;
//import com.xworkz.book.repository.BookRepoImpl;

import java.sql.SQLException;
public class BookServiceImpl implements BookService {
    BookRepoImpl repository = new BookRepoImpl();

    @Override
    public boolean validateAndSave(BookDto dto) {
        if (dto != null) {
            if (dto.getId() > 0) {
                if (dto.getBookName() != null && dto.getBookType() != null) {
                    if (dto.getPrice() <= 500) {
                        System.out.println("Book is validated");
                        return repository.save(dto);
                    }
                }
            }

        }
        return false;
    }

    @Override
    public BookDto findById(int id) {
        if (id > 0) {
            System.out.println("id is valid now send");
            return repository.findByBookID(id);
        }
        System.out.println("id is not valid");
        return null;
    }

    @Override
    public boolean updateVersionByBookName(String bookName, String version) {
        if (bookName != null) {
            System.out.println("bookName is valid");
            if (version != null) {
                System.out.println("version is valid");
                return repository.updateVersionByBookName(bookName, version);
            } else {
                System.out.println("version is not valid");
            }
        } else {
            System.out.println("bookName is not valid");
        }

        return false;
    }

    public boolean deleteBybookName(String bookName) {
        if(bookName !=null && bookName.length()>=5){
            System.out.println("deleted book");
        }
        return false;
    }
}



