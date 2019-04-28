package zadanieextraSamochod;

public class VehicleConstructor {

    private String name;
    private int wheels;
    private String engine;
    private int fuel;


    public VehicleConstructor(String name, int wheels, String engine, int fuel) {
        this.name = name;
        this.wheels = wheels;
        this.engine = engine;
        this.fuel = fuel;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
