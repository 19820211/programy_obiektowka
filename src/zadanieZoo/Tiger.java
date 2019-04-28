package zadanieZoo;

public class Tiger extends Animal {
    private int clawLenght;

    public Tiger(String name, float weight, int clawLenght) {
        super(name, weight);
        this.clawLenght = clawLenght;
    }

    @Override
    public void introduce() {
        System.out.print(
                        "I'm tiger. My name is "
                        + this.name + ". I weight "
                        + this.weight
                        + "kg and my fur length is"
                        + clawLenght + "."
        );
    }

    public int getClawLenght() {
        return clawLenght;
    }

    public void setClawLenght(int clawLenght) {
        this.clawLenght = clawLenght;
    }
}
