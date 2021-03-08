package ru.volodichev.factoryCars;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ru.volodichev.factoryCars.Car.Car;
import ru.volodichev.factoryCars.Details.Carcase;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type Main
 */
public class Main {
public static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Storage storage = new Storage();

        storage.deliveryDetails();
        Main.logger.debug("Детали были добавлены на склад");

        List<Car> cars;

        AssemblerCar assemblerCar = new AssemblerCar();
        cars = assemblerCar.assemblyCar(storage);
        logger.info("Процесс сборки завершен на складе осталось " + storage.getsCountDetails() + " неизрасходованных деталей");

        cars.stream().forEach(s -> System.out.println(s.toString()));
    }
}
