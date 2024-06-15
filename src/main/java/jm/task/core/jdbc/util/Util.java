package jm.task.core.jdbc.util;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static Connection getConnection() throws SQLException {
        Connection conn = null;
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lern_table", "root", "Mironov@27081997");
        conn.setAutoCommit(false);
        if (conn.isClosed()){
            System.out.println("JDBC connection is closed");
        }return conn;
    }
}
