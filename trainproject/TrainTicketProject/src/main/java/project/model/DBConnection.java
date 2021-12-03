package project.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private  static  Connection connection;
    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project",
                    "root","Rajuraju@1");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

}
