package home_works.home_work_17.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionData {

    private static Connection connection;
    private static final String name = "postgres";
    private static final String password = "marouned";

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/java", name, password);
        }
        return connection;
    }
}
