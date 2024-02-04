package com.xworkz.book.Repository;
import com.xworkz.book.dto.BookDto;

import java.sql.SQLException;
public interface BookRepo {
    public boolean save(BookDto dto);
    public BookDto findByBookID(int id);
    public boolean updateVersionByBookName(String bookName, String version);
    public boolean deleteBybookName(String bookName);
}



