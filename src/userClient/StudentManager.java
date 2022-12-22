package userClient;

import userClient.model.Student;

import javax.xml.transform.Result;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class StudentManager {
    public static void createTableStudent(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE marko.student (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "name VARCHAR(15)NOT NULL," +
                "class INT NOT NULL," +
                "letter VARCHAR(40) NOT NULL," +
                "age INT NOT NULL," +
                "PRIMARY KEY (id));");
    }
    public static void addColum(Statement statement) throws SQLException {
        statement.executeUpdate("ALTER TABLE marko.student ADD id_room INT NOT NULL ");
    }
    public static void addStudentToDatabase(Statement ps, Student student) throws SQLException{
        ps.executeUpdate("INSERT INTO marko.student(name, class, letter, age, id_room) VALUES ('"+ student.getName() +"', '"+ student.getClas() +"', '"+ student.getLetter() +"', '"+ student.getAge() +"', '"+ student.getClassRoom().getId() +"');");
    }
    public static void addStudents(Statement statement, List<Student> students) throws SQLException {
        for (Student student : students) {
            addStudentToDatabase(statement, student);
        }
    }
    public static void addForeignKey(Statement statement) throws SQLException {
        statement.executeUpdate("ALTER TABLE marko.student ADD FOREIGN KEY (id_room) REFERENCES marko.rooms(id);");
    }
    public static Student mapToStudent(ResultSet resultSet) throws SQLException {
        return new Student(resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("class"),
                resultSet.getString("letter"),
                resultSet.getInt("age"),
                new ClassRoom(resultSet.getInt("room_id"),
                        resultSet.getString("room_manager"),
                        resultSet.getInt("number_of_seats")));
    }
    public static void joinTables(Statement statement) throws SQLException {
       ResultSet resultSet = statement.executeQuery("SELECT s.id, s.name, s.class, s.letter, s.age, r.id as room_id, r.room_manager, r.number_of_seats FROM marko.student s INNER JOIN marko.rooms r ON s.id_room = r.id;");
       while (resultSet.next()){
           Student student = mapToStudent(resultSet);
           System.out.println(student);
       }
    }
}
