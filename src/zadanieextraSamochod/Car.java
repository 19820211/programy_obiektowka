package zadanieextraSamochod;

public class Car extends VehicleConstructor implements Vehicle{

    private static final double CONSUMES = 3.4;


    public Car(String name, int wheels, String engine, int fuel) {
        super(name, wheels, engine, fuel);
    }

    @Override
    public void run(int distance) {
        double result = (double) distance / CONSUMES;
        System.out.println("run to " + distance + " ");
    }

    @Override
    public void tank() {

    }

    @Override
    public void stop() {

    }
}
