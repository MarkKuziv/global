package auto.data.helper;

import auto.data.enums.*;
import auto.data.model.Car;
import auto.data.model.Engine;

import java.util.List;

public class CarHelper {



    public static List<Car> getCar() {
        Car car1 = new Car(1,
                "Audi",
                5,
                8.000,
                2005,
                EngineHelper.engine5,
                ColorEnum.BLACK,
                AutoModelEnum.A6,
                AutoModificationEnum.C6,
                OccasionEnum.FULL);
        Car car2 = new Car(2,
                "Audi",
                5,
                19.000,
                2015,
                EngineHelper.engine3,
                ColorEnum.RED,
                AutoModelEnum.A6,
                AutoModificationEnum.C7,
                OccasionEnum.FULL);
        Car car3 = new Car(3,
                "Audi",
                5,
                25.000,
                2020,
                EngineHelper.engine4,
                ColorEnum.BLACK,
                AutoModelEnum.A6,
                AutoModificationEnum.C8,
                OccasionEnum.FRONT);
        Car car4 = new Car(4,
                "Audi",
                5,
                8.000,
                2011,
               EngineHelper.engine1,
                ColorEnum.WHILE,
                AutoModelEnum.A4,
                AutoModificationEnum.B7,
                OccasionEnum.FULL);
        Car car5 = new Car(5,
                "Audi",
                5,
                14.000,
                2018,
                EngineHelper.engine2,
                ColorEnum.BLUE,
                AutoModelEnum.A4,
                AutoModificationEnum.B8,
                OccasionEnum.FRONT);
        Car car6 = new Car(6,
                "Audi",
                5,
                16.000,
                2018,
                EngineHelper.engine3,
                ColorEnum.BLACK,
                AutoModelEnum.A4,
                AutoModificationEnum.B8,
                OccasionEnum.FULL);
        return List.of(car1, car2, car3, car4, car5, car6);
    }
}
