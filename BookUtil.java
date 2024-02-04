package com.xworkz.book.bookUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookUtil {

public static Connection getConnection() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3308/Bookdto2", "root", "niveditha@22");
        return connection;
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
    return null;
}

}