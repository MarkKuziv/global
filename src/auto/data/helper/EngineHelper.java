package auto.data.helper;

import auto.data.enums.TypeFuelEnum;
import auto.data.model.Engine;

import java.util.List;

public class EngineHelper {

    public static Engine engine1 = new Engine(1, TypeFuelEnum.DIESEL, 2.0f, 140);
    public static Engine engine2 = new Engine(2, TypeFuelEnum.GASOLINE, 1.8f, 170);
    public static Engine engine3 = new Engine(3, TypeFuelEnum.DIESEL, 3.0f, 240);
    public static Engine engine4 = new Engine(4, TypeFuelEnum.DIESEL, 2.0f, 170);
    public static Engine engine5 = new Engine(5, TypeFuelEnum.DIESEL, 3.0f, 225);

    public static List<Engine> engines = List.of(engine1, engine2, engine3, engine4, engine5);

    public static List<Engine> getEngine(){
        return engines;
    }
}
