package userClient.helper;

import userClient.model.User;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class UserHelper {
    public static List<User> getUsers(){
        User user1 = new User(1, "127.70.102", 11111, "Jon", LocalDate.parse("2021-02-02"));
        User user2 = new User(2, "149.80.002", 22222, "Andriy", LocalDate.parse("2021-03-02") );
        User user3 = new User(3, "256.10.123", 33333, "Robb",LocalDate.parse("2021-04-02"));
        User user4 = new User(4, "555.30.132", 44444, "Rot",LocalDate.parse("2021-05-02"));
        User user5 = new User(5, "654.12.500", 55555, "Bob",LocalDate.parse("2021-06-02"));
        return List.of(user1, user2, user3, user4, user5);
    }
}
