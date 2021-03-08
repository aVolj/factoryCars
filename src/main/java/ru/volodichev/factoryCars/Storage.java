package ru.volodichev.factoryCars;

import ru.volodichev.factoryCars.Details.Carcase;
import ru.volodichev.factoryCars.Details.Engine;
import ru.volodichev.factoryCars.Details.Wheels;

import java.util.ArrayList;
import java.util.List;

/**
 * todo Document type Storage
 */
public class Storage {
    private List<Wheels> wheels = new ArrayList<Wheels>();
    private List<Engine> engines = new ArrayList<Engine>();
    private List<Carcase> carcases = new ArrayList<Carcase>();

    public List<Wheels> getWheels() {
        return wheels;
    }

    public void setWheels(List<Wheels> wheels) {
        this.wheels = wheels;
    }

    public List<Engine> getEngines() {
        return engines;
    }

    public void setEngines(List<Engine> engines) {
        this.engines = engines;
    }

    public List<Carcase> getCarcases() {
        return carcases;
    }

    public void setCarcases(List<Carcase> carcases) {
        this.carcases = carcases;
    }

    public void deliveryDetails() {
        Manufacturer[] manufacturers;
        manufacturers = Manufacturer.values();
        for (int i = 0; i < 10; i++) {

            wheels.add(new Wheels(manufacturers[((int) (Math.random() * 2))]));
            engines.add(new Engine(manufacturers[((int) (Math.random() * 2))]));
            carcases.add(new Carcase(manufacturers[((int) (Math.random() * 2))]));
        }
    }
    public int getsCountDetails(){
        return wheels.size() + engines.size() + carcases.size();
}

}
