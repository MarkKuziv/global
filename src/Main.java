
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // test commit
        //2
//        3
//        4
        Car car1 = new Car(1, "BMW", "Gray", 2, 2002, "Wagon");
        Car car2 = new Car(2, "Audi", "Gray", 3, 2005, "Wagon");
        Car car3 = new Car(3, "Audi", "Blue", 4, 2010, "Sedan");
        Car car4 = new Car(4, "Mercedes-Benz", "Gray", 3, 2005, "Coupe");
        Car car5 = new Car(5, "BMW", "Black", 5, 2015, "Wagon");
        Car car6 = new Car(6, "Opel", "While", 2, 2008, "Coupe");
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        list.add(car6);

        String username = "root";
        String url = "jdbc:mysql://localhost/marko";
        String password = "root";
        try (Connection conn = DriverManager.getConnection(url, username, password)) {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Statement ps = conn.createStatement();

//            ps.executeUpdate("CREATE TABLE `marko`.`car` (" +
//                    "  `idCar` INT NOT NULL AUTO_INCREMENT," +
//                    "  `Color` VARCHAR(45) NOT NULL," +
//                    "  `Name` VARCHAR(45) NOT NULL," +
//                    "  `Type` VARCHAR(45) NOT NULL," +
//                    "  PRIMARY KEY (`idCar`));");

//            for (Car car : list) {
//                addCarToDatabase(ps, car);
//            }

//            ResultSet resultSet = ps.executeQuery("SELECT * FROM marko.car WHERE name LIKE 'BMW';");
//            while (resultSet.next()) {
//                Car car = mapToCar(resultSet);
//                System.out.println(car);
//            }

            int rows = ps.executeUpdate("UPDATE marko.car t SET t.color = 'black'");
            System.out.printf("Updated %d rows", rows);

//            int rows = ps.executeUpdate("DELETE FROM marko.car");
//            System.out.printf("%d row(s) deleted", rows);
        } catch (Exception ex) {
            System.out.println("Connection failed...");
        }

    }

    private static Car mapToCar(ResultSet resultSet) throws SQLException {
        return new Car(resultSet.getInt("idCar"),
                resultSet.getString("Name"),
                resultSet.getString("Color"),
                resultSet.getString("Type")
        );
    }

    public static void addCarToDatabase(Statement ps, Car car) throws SQLException {
        ps.executeUpdate("INSERT INTO `marko`.`car` (`Name`,`Color`, `Type`) VALUES ('" + car.getCarsName() +"','"+ car.getColor() +"', '"+ car.getType() +"');");
    }
}

// return name    "Marko"      car.getName() "BMW"
// 'car.getName()'        " adsdasd" + car.getName + "
// "insert into .. values
