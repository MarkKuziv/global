package auto.data.manager;

import auto.data.enums.*;
import auto.data.model.Car;
import auto.data.model.Engine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CarManager {
    public static void createTableCar(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE marko.car (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "name VARCHAR(15)NOT NULL," +
                "doors INT NOT NULL," +
                "price INT NOT NULL," +
                "year INT NOT NULL," +
                "engine_id INT NOT NULL," +
                "PRIMARY KEY (id)," +
                "FOREIGN KEY (engine_id) REFERENCES marko.engine(id));");
    }

    public static void addColum(Statement statement) throws SQLException {
        statement.executeUpdate("ALTER TABLE marko.car ADD COLUMN color VARCHAR(50), ADD COLUMN auto_model VARCHAR(50), ADD COLUMN auto_midification VARCHAR(50), ADD COLUMN occasion VARCHAR(50);");
    }

    public static void addCar(Statement statement, List<Car> carList) throws SQLException {
        for (Car car : carList) {
            addCarToDatabase(statement, car);

        }
    }

    public static void addCarToDatabase(Statement statement, Car car) throws SQLException {
        statement.executeUpdate("INSERT INTO marko.car(name, doors, price, year, engine_id, color, auto_model, auto_midification, occasion) VALUES ('" + car.getName() + "','" + car.getDoors() + "','" + car.getPrice() + "','" + car.getYear() + "','" + car.getEngine().getId() + "','" + car.getColorEnum() + "','" + car.getAutoModelEnum() + "','" + car.getAutoModificationEnum() + "','" + car.getOccasionEnum() + "');");
    }
    public static Car mapToCar(ResultSet resultSet) throws SQLException {
        return new Car(resultSet.getInt("id"),
                resultSet.getString("name"),
                resultSet.getInt("doors"),
                resultSet.getInt("price"),
                resultSet.getInt("year"),
                new Engine(resultSet.getInt("engine_id"), Enum.valueOf(TypeFuelEnum.class, resultSet.getString("type_fuel")), resultSet.getFloat("power"), resultSet.getInt("hp")),
                Enum.valueOf(ColorEnum.class, resultSet.getString("color")),
                Enum.valueOf(AutoModelEnum.class, resultSet.getString("auto_model")),
                Enum.valueOf(AutoModificationEnum.class, resultSet.getString("auto_midification")),
                Enum.valueOf(OccasionEnum.class, resultSet.getString("occasion")));
    }
    public static void getCars(Statement statement) throws SQLException {
      ResultSet resultSet = statement.executeQuery("SELECT c.id, c.name, c.doors, c.price, c.year, c.engine_id, c.color, c.auto_model, c.auto_midification, c.occasion, e.id as id_eng, e.type_fuel, e.power, e.hp FROM marko.car c INNER JOIN marko.engine e ON c.engine_id = e.id;");
        while (resultSet.next()){
            Car car = mapToCar(resultSet);
            System.out.println(car);
        }
    }

}

