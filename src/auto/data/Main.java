package auto.data;

import auto.data.helper.CarHelper;
import auto.data.helper.EngineHelper;
import auto.data.manager.CarManager;
import auto.data.manager.Connection;
import auto.data.manager.EngineManager;
import auto.data.model.Car;
import auto.data.model.Engine;
import userClient.ConnectionToDatabase;
import userClient.helper.UserHelper;
import userClient.model.User;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Statement statement;
        List<User> userList = UserHelper.getUsers();
        List<Car> carList = CarHelper.getCar();
        List<Engine>engineList = EngineHelper.getEngine();
        try {
            statement = ConnectionToDatabase.connect();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (statement == null) {
            System.out.println("Statement == null");
        } else {
//            Connection.connect();
//            EngineManager.createTableEngine(statement);
//            CarManager.createTableCar(statement);
//            CarManager.addColum(statement);
//            EngineManager.addEngine(statement, engineList);
//            CarManager.addCar(statement, carList);
//            EngineManager.addColum(statement);
//            EngineManager.getEngine(statement);
            CarManager.getCars(statement);
        }

    }
}
