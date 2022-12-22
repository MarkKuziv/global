package userClient;

import userClient.model.User;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class DatabaseManager {
    public static void createTable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE marko.users (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "ip VARCHAR(15)NOT NULL," +
                "identification_code INT NOT NULL," +
                "name VARCHAR(40) NOT NULL," +
                "date_visit DATETIME NOT NULL," +
                "PRIMARY KEY (id));");
    }

    public static void deleteTable(Statement statement) throws SQLException {
        statement.executeUpdate("DROP TABLE marko.users;");
    }
    public static void addToDatabase(Statement statement, List<User> userList) throws SQLException {
        for (User user:userList){
            addUserToDatabase(statement, user);
        }

    }
    public static void addUserToDatabase(Statement ps, User user) throws SQLException {
        ps.executeUpdate("INSERT INTO marko.users (ip, identification_code, name, date_visit ) VALUES ('" + user.getIp() +"','"+ user.getIdentificationCode() +"', '"+ user.getName() +"', '"+ user.getDateTime()+"');");
    }
}



