public class Car {
    private final int id;
    private String carsName;
    private String color;
    private int engine;
    private int years;
    private String type;

    public Car(int id, String carsName, String color, int engine, int years, String type) {
        this.id = id;
        this.carsName = carsName;
        this.color = color;
        this.engine = engine;
        this.years = years;
        this.type = type;
    }
    public Car(int id, String carsName, String color, String type){
        this.id = id;
        this.carsName = carsName;
        this.color = color;
        this.type = type;
    }

    public int getId() {
        return id;
    }
    public String getCarsName() {
        return carsName;
    }

    public void setCarsName(String carsName) {
        this.carsName = carsName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;

    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Сar{" +
                "carsName='" + carsName + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                ", years=" + years +
                ", type='" + type + '\'' +
                '}';
    }

}
