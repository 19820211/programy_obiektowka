package zadanieZoo;

public class Dog extends Animal implements Cannie{

    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void introduce() {
        System.out.print("I'm dog. My name is "
                + this.name
                + ". I weight "
                + this.weight
                + "kg.");
    }

    @Override
    public void bark() {
        System.out.println("bark bark bark");
    }

    public void sitPretty(){
        System.out.println(this.name + " sits pretty.");
    }
}
