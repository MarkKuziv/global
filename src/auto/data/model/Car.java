package auto.data.model;

import auto.data.enums.*;

public class Car {
    private final int id;
    private String name;
    private int doors;
    private double price;
    private int year;
    private Engine engine;
    private ColorEnum colorEnum;
    private AutoModelEnum autoModelEnum;
    private AutoModificationEnum autoModificationEnum;
    private OccasionEnum occasionEnum;

    public Car(int id, String name, int doors, double price, int year, Engine engine, ColorEnum colorEnum, AutoModelEnum autoModelEnum, AutoModificationEnum autoModificationEnum, OccasionEnum occasionEnum) {
        this.id = id;
        this.name = name;
        this.doors = doors;
        this.price = price;
        this.year = year;
        this.engine = engine;
        this.colorEnum = colorEnum;
        this.autoModelEnum = autoModelEnum;
        this.autoModificationEnum = autoModificationEnum;
        this.occasionEnum = occasionEnum;
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

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public ColorEnum getColorEnum() {
        return colorEnum;
    }

    public void setColorEnum(ColorEnum colorEnum) {
        this.colorEnum = colorEnum;
    }

    public AutoModelEnum getAutoModelEnum() {
        return autoModelEnum;
    }

    public void setAutoModelEnum(AutoModelEnum autoModelEnum) {
        this.autoModelEnum = autoModelEnum;
    }

    public AutoModificationEnum getAutoModificationEnum() {
        return autoModificationEnum;
    }

    public void setAutoModificationEnum(AutoModificationEnum autoModificationEnum) {
        this.autoModificationEnum = autoModificationEnum;
    }

    public OccasionEnum getOccasionEnum() {
        return occasionEnum;
    }

    public void setOccasionEnum(OccasionEnum occasionEnum) {
        this.occasionEnum = occasionEnum;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doors=" + doors +
                ", price=" + price +
                ", year=" + year +
                ", engine=" + engine +
                ", colorEnum=" + colorEnum +
                ", autoModelEnum=" + autoModelEnum +
                ", autoModificationEnum=" + autoModificationEnum +
                ", occasionEnum=" + occasionEnum +
                '}';
    }
}
