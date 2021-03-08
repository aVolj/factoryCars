package ru.volodichev.factoryCars.Car;

import ru.volodichev.factoryCars.Details.Carcase;
import ru.volodichev.factoryCars.Details.Engine;
import ru.volodichev.factoryCars.Details.Wheels;
import ru.volodichev.factoryCars.Manufacturer;

/**
 * todo Document type ru.volodichev.factoryCars.car
 */
public abstract class Car {
    Wheels wheels;
    Engine engine;
    Carcase carcase;

    Manufacturer manufacturer;
    long vin;

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Carcase getCarcase() {
        return carcase;
    }

    public void setCarcase(Carcase carcase) {
        this.carcase = carcase;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getVin() {
        return vin;
    }

    public void setVin(long vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
            ", manufacturer=" + manufacturer +
            ", vin=" + vin +
            '}';
    }
}
