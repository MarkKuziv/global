package userClient;

import userClient.helper.UserHelper;
import userClient.model.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import static userClient.DatabaseManager.createTable;
import static userClient.helper.ClassRoomHelper.getClassRoom;
import static userClient.helper.StudentHelper.getStudent;

public class Main {
    public static void main(String[] args) throws SQLException {
        Statement statement;
        List<User> userList = UserHelper.getUsers();
        try {
            statement = ConnectionToDatabase.connect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (statement == null) {
            System.out.println("Statement == null");
        } else {

        }

    }
}
