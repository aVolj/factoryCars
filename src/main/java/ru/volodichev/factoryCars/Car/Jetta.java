package ru.volodichev.factoryCars.Car;

import ru.volodichev.factoryCars.Details.Carcase;
import ru.volodichev.factoryCars.Details.Engine;
import ru.volodichev.factoryCars.Details.Wheels;
import ru.volodichev.factoryCars.Manufacturer;

/**
 * todo Document type Jetta
 */
public class Jetta extends Car{
    public Jetta(Wheels w, Engine e, Carcase c) {
        this.wheels = w;
        this.engine = e;
        this.carcase = c;
        this.manufacturer = Manufacturer.JETTA;
        this.vin = (long) (Math.random()*10000+1000);
    }

    @Override
    public String toString() {
        return "Jetta{" +
            "manufacturer=" + manufacturer +
            ", vin=" + vin +
            '}';
    }
}
