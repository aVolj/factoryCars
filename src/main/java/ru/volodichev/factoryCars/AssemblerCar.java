package ru.volodichev.factoryCars;

import ru.volodichev.factoryCars.Car.Car;
import ru.volodichev.factoryCars.Car.Jetta;
import ru.volodichev.factoryCars.Car.Polo;
import ru.volodichev.factoryCars.Details.Carcase;
import ru.volodichev.factoryCars.Details.Engine;
import ru.volodichev.factoryCars.Details.Wheels;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * todo Document type AssemblerCar
 */
public class AssemblerCar {
    public List<Car> assemblyCar(Storage storage) {
        List<Carcase> carcases = storage.getCarcases();
        List<Wheels> wheels = storage.getWheels();
        List<Engine> engines = storage.getEngines();

        Main.logger.info("Началась сборка Car");

        List<Car> cars = new ArrayList<>();
        for (Iterator<Carcase> itCarcase = carcases.iterator(); itCarcase.hasNext(); ) {
            to:
            {
                Carcase carcase1 = itCarcase.next();
                Main.logger.trace("Перешли к следующему кузову");
                for (Iterator<Wheels> itWheels = wheels.iterator(); itWheels.hasNext(); ) {
                    Wheels wheels1 = itWheels.next();
                    if (carcase1.getManufacturer() == wheels1.getManufacturer()) {
                        for (Iterator<Engine> itEngine = engines.iterator(); itEngine.hasNext(); ) {
                            Engine engine1 = itEngine.next();
                            if (engine1.getManufacturer() == wheels1.getManufacturer()) {
                                if (engine1.getManufacturer() == Manufacturer.JETTA) {
                                    cars.add(new Jetta(wheels1, engine1, carcase1));

                                    Main.logger.debug("Была собрана JETTA");
                                } else {
                                    cars.add(new Polo(wheels1, engine1, carcase1));
                                    Main.logger.debug("Был собран POLO");
                                }
                                itCarcase.remove();
                                Main.logger.trace("удалили из коллекции кузовов текущий элемент");
                                itWheels.remove();
                                Main.logger.trace("удалили из коллекции колес текущий элемент");
                                itEngine.remove();
                                Main.logger.trace("удалили из коллекции моторов текущий элемент");
                                Main.logger.trace("\"прыгнули\" на метку");
                                break to;
                            }
                        }
                    }
                }
            }
        }

        return cars;
    }
}
