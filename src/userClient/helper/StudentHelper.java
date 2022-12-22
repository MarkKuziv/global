package userClient.helper;

import userClient.ClassRoom;
import userClient.model.Student;

import java.util.List;

public class StudentHelper {
    public static List<Student> getStudent(){
        ClassRoom classRoom1 = new ClassRoom(1, "Oleg", 20);
        ClassRoom classRoom2 = new ClassRoom(2, "Misha", 23);
        Student student1 = new Student(1, "Alex", 3, "A", 17, classRoom1);
        Student student2 = new Student(2, "Jason", 2, "B", 16, classRoom2);
        Student student3 = new Student(3, "Nick", 5, "C", 19, classRoom2);
        Student student4 = new Student(4, "Mayk", 1, "D", 15, classRoom1);
        Student student5 = new Student(5, "Jack", 4, "E", 18, classRoom1);
        return List.of(student1, student2, student3, student4, student5);
    }
}
