package userClient.helper;

import userClient.ClassRoom;
import userClient.model.Student;

import java.util.List;

public class ClassRoomHelper {
    public static List<ClassRoom> getClassRoom(){
        ClassRoom classRoom1 = new ClassRoom(1, "Oleg", 20);
        ClassRoom classRoom2 = new ClassRoom(2, "Misha", 23);
        return List.of(classRoom1, classRoom2);
    }
}
