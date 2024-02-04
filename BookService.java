package com.xworkz.book.service;
import com.xworkz.book.dto.BookDto;

import java.sql.SQLException;

public interface BookService {
    public boolean validateAndSave(BookDto dto);
    public BookDto findById(int id);

    public  boolean updateVersionByBookName( String bookName ,String version) ;
    public boolean deleteBybookName(String bookName);
}
