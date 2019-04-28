package zadanieZoo;

public class Bear extends Animal{

    private int furLenth;

    public Bear(String name, float weight, int furLenth) {
        super(name, weight);
        this.furLenth = furLenth;
    }

    @Override
    public void introduce() {
            System.out.print(
                            "I'm bear. My name is "
                            + this.name + ". I weight "
                            + this.weight
                            + "kg and my fur length is"
                            + furLenth + "."
            );

    }

    public int getFurLenth() {
        return furLenth;
    }

    public void setFurLenth(int furLenth) {
        this.furLenth = furLenth;
    }
}

// todo - zrób to na jutro
