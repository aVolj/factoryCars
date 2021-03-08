package ru.volodichev.factoryCars.Details;

import ru.volodichev.factoryCars.Manufacturer;

/**
 * todo Document type Engine
 */
public class Engine extends Details{
    public Engine(Manufacturer s) {
        this.manufacturer = s;
    }


    public Manufacturer getManufacturer(){
        return this.manufacturer;
    }
}
