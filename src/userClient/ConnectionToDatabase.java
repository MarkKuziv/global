package userClient;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionToDatabase {
    public static Statement connect() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        String url = "jdbc:mysql://localhost/marko";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection conn = DriverManager.getConnection(url, username, password);

        return conn.createStatement();
    }
}

