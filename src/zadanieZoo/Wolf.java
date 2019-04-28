package zadanieZoo;

public class Wolf extends Animal implements Cannie {

    private  int fangLength;

    public Wolf(String name, float weight, int fangLength) {
        super(name, weight);
        this.fangLength = fangLength;
    }

    @Override
    public void introduce() {
        System.out.print(
                "I'm wolf. My name is "
                        + this.name + ". I weight "
                        + this.weight
                        + "kg and my fur length is"
                        + fangLength + ".");
    }

        @Override
        public void bark () {
            System.out.println("BARK BARK BARK");
        }

        public int getFangLength () {
            return fangLength;
        }

        public void setFangLength ( int fangLength){
            this.fangLength = fangLength;
        }

}
