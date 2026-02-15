package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class Util {

    private static final String URL_KEY = "db.url";
    private static final String USER_key = "db.username";
    private static final String PASSWORD_KEY = "db.password";

    private Util() {
    }

    public static Connection getConnection() throws SQLException {
        try {
            return DriverManager.getConnection(
                    PropertiesUtil.getProperty(URL_KEY),
                    PropertiesUtil.getProperty(USER_key),
                    PropertiesUtil.getProperty(PASSWORD_KEY)
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}