package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by FromxSoul on 23.04.2016.
 */
public class DBworker {

    private final String URL = "jdbc:mysql://localhost:3306/mydbtest";
    private final String USERNAME = "root";
    private final String PASSWORD = "testsql";

    private Connection connection;

    public DBworker() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
