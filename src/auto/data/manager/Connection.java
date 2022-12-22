package auto.data.manager;

import java.lang.reflect.InvocationTargetException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
    public static Statement connect() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, SQLException {
        String url = "jdbc:mysql://localhost/marko";
        String username = "root";
        String password = "root";

        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        java.sql.Connection conn = DriverManager.getConnection(url, username, password);

        return conn.createStatement();
    }
}