package userClient;

import userClient.model.Student;
import userClient.model.User;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class RoomTableManager {
    public static void createTable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE marko.rooms (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "room_manager VARCHAR(15)NOT NULL," +
                "number_of_seats INT NOT NULL," +
                "PRIMARY KEY (id));");
    }

    public static void addClassRoomToDatabase(Statement ps, ClassRoom classRoom) throws SQLException {
        ps.executeUpdate("INSERT INTO marko.rooms(id, room_manager, number_of_seats) VALUES ('" + classRoom.getId() + "','" + classRoom.getRoomManager() + "', '" + classRoom.getNumberOfSeats() + "');");
    }

    public static void addToDatabase(Statement statement, List<ClassRoom> classRooms) throws SQLException {
        for (ClassRoom classRoom : classRooms) {
            addClassRoomToDatabase(statement, classRoom);
        }
    }
}

