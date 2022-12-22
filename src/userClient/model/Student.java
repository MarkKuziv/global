package userClient.model;

import userClient.ClassRoom;

public class Student {
    private final int id;
    private String name;
    private int clas;
    private String letter;
    private int age;
    private ClassRoom classRoom;

    public Student(int id, String name, int clas, String letter, int age, ClassRoom classRoom) {
        this.id = id;
        this.name = name;
        this.clas = clas;
        this.letter = letter;
        this.age = age;
        this.classRoom = classRoom;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClas() {
        return clas;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", clas=" + clas +
                ", letter='" + letter + '\'' +
                ", age=" + age +
                ", classRoom=" + classRoom +
                '}';
    }
}
