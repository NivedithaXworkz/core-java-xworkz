package com.xworkz.book;
import com.xworkz.book.dto.BookDto;
import com.xworkz.book.service.BookService;
import com.xworkz.book.service.BookServiceImpl;
public class BookExecutor {
    public static void main(String args[]) {
        BookService service = new BookServiceImpl();
        BookDto dto = new BookDto(1, "The Wings Of Fire", "Novel", "2.0", "Universities press", "Abdual kalam", 500);
        service.validateAndSave(dto);
        BookDto returnDto = service.findById(1);
        System.out.println(returnDto);
        Boolean value = service.updateVersionByBookName("The Wings Of Fire", "5.0");
        System.out.println(value);
        Boolean delete = service.deleteBybookName("The Wings Of Fire");
        System.out.println(delete);
    }
}
