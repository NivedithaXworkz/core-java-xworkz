package com.xworkz.book.Repository;
import com.xworkz.book.bookUtils.BookUtil;
import com.xworkz.book.dto.BookDto;
//import com.xworkz.book.util.Bookutils;

import java.sql.*;

public class BookRepoImpl implements BookRepo {
    @Override
    public boolean save(BookDto dto) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/Bookdto2", "root", "niveditha@22");
            String query = "Insert into book1 values(?,?,?,?,?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, dto.getId());
            statement.setString(2, dto.getBookName());
            statement.setString(3, dto.getBookType());
            statement.setString(4, dto.getVersion());
            statement.setString(5, dto.getPublisher());
            statement.setString(6, dto.getAuthor());
            statement.setInt(7, dto.getPrice());

            int rowsAffected = statement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public BookDto findByBookID(int id) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/Bookdto2", "root", "niveditha@22");
            String query = "select * from book1 where id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            ResultSet set = statement.executeQuery();

            BookDto dto = new BookDto();
            while (set.next()) {
                int returnedId = set.getInt("id");
                String bookName = set.getString("bookName");
                String bookType = set.getString("bookType");
                String version = set.getString("version");
                String publisher = set.getString("publisher");
                String author = set.getString("author");
                int price = set.getInt("price");

                dto.setId(returnedId);
                dto.setBookName(bookName);
                dto.setBookType(bookType);
                dto.setVersion(version);
                dto.setPublisher(publisher);
                dto.setAuthor(author);
                dto.setPrice(price);
            }
            return dto;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean updateVersionByBookName(String bookName, String version) {
        Connection connection = BookUtil.getConnection();
        String query = "update book1 set version = ? where bookName = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, bookName);
            statement.setString(2, version);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }



@Override
    public boolean deleteBybookName(String bookName) {
        Connection connection = BookUtil.getConnection();
        String query4 = "delete from book1 where bookName = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(query4);
            statement.setString(1,bookName);
            int rowsAffected = statement.executeUpdate();
            if(rowsAffected>0){
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

}





