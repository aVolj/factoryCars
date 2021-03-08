package ru.volodichev.factoryCars.Details;

import ru.volodichev.factoryCars.Manufacturer;

/**
 * todo Document type Wheels
 */
public class Wheels extends Details{
    public Wheels(Manufacturer s) {
        this.manufacturer = s;
    }

    public Manufacturer getManufacturer(){
        return this.manufacturer;
    }
}
