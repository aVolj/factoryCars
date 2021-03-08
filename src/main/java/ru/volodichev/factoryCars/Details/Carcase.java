package ru.volodichev.factoryCars.Details;

import ru.volodichev.factoryCars.Manufacturer;

/**
 * todo Document type Carcase
 */
public class Carcase extends Details{

    public Carcase(Manufacturer s) {
        this.manufacturer = s;
    }

    public Manufacturer getManufacturer(){
        return this.manufacturer;
    }
}
