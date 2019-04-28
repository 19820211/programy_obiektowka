package zadanieextraSamochod;

public class Bike extends VehicleConstructor implements Vehicle{

    private static final double CONSUMES = 2.4;

    public Bike(String name, int wheels, String engine, int fuel) {
        super(name, wheels, engine, fuel);
    }

    @Override
    public void run(int distance) {

        double result = (double) distance / CONSUMES;
        System.out.println("run to " + distance + " ");

    }

    @Override
    public void tank() {
        System.out.println("tank");

    }

    @Override
    public void stop() {
        System.out.println("stop");

    }
}
