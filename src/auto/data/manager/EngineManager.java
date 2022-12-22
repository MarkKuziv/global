package auto.data.manager;

import auto.data.enums.TypeFuelEnum;
import auto.data.model.Car;
import auto.data.model.Engine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class EngineManager {
    public static void createTableEngine(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE marko.engine (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "power INT NOT NULL," +
                "hp INT NOT NULL," +
                "PRIMARY KEY (id));");
    }

    public static void addColum(Statement statement) throws SQLException {
        statement.executeUpdate("ALTER TABLE marko.engine ADD COLUMN type_fuel VARCHAR(50) NULL;");
    }

    public static void addEngineToDatabase(Statement statement, Engine engine) throws SQLException {
        statement.executeUpdate("INSERT INTO marko.engine(power, hp) VALUES ('" + engine.getPower() + "', '" + engine.getHp() + "');");
    }

    public static void addEngine(Statement statement, List<Engine> engineList) throws SQLException {
        for (Engine engine : engineList) {
            addEngineToDatabase(statement, engine);
        }
    }

    public static Engine mapToEngine(ResultSet resultSet) throws SQLException {
        return new Engine(resultSet.getInt("id"),
                Enum.valueOf(TypeFuelEnum.class, resultSet.getString("type_fuel")),
                resultSet.getInt("power"),
                resultSet.getInt("hp"));
    }

    public static void getEngine(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM marko.engine e WHERE e.id = 3;");
        while (resultSet.next()) {
            Engine engine = mapToEngine(resultSet);
            System.out.println(engine);
        }
    }
}
