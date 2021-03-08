package ru.volodichev.factoryCars;

import org.junit.jupiter.api.*;
import ru.volodichev.factoryCars.Car.Car;
import ru.volodichev.factoryCars.Car.Jetta;
import ru.volodichev.factoryCars.Details.Carcase;
import ru.volodichev.factoryCars.Details.Engine;
import ru.volodichev.factoryCars.Details.Wheels;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * todo Document type CarsTest
 */
public class CarsTest {
    static Storage storage;
    static AssemblerCar assemblerCar;
    static Car car;

    @BeforeAll
   static void setUp(){
        storage = new Storage();
        storage.deliveryDetails();

        assemblerCar = new AssemblerCar();
    }

    @DisplayName("Метод deliveryDetails генерерует 3 непустых листа деталей")
    @Test
    void generationDetails(){
        storage.deliveryDetails();
        assertNotNull(storage.getCarcases());
        assertNotNull(storage.getEngines());
        assertNotNull(storage.getWheels());
    }

    @DisplayName("Экземпляр классов Polo/Jetta получает случайный vin номер в формате Long")
    @Test
    void vinGetLong(){
        car = new Jetta(new Wheels(Manufacturer.JETTA), new Engine(Manufacturer.JETTA), new Carcase(Manufacturer.JETTA));
        long testVin = car.getVin();
        assertNotNull(testVin);
    }

    @DisplayName("Метод сборки(assemblyCar) возвращает ArrayList и он не пустой")
    @Test
    void assemblyCarTest(){
        List<Car> carList = assemblerCar.assemblyCar(storage);
       assertTrue(carList instanceof ArrayList);
       assertNotNull(carList);
    }


}
