package zadanieBank;

public class OuterClass {
    //klasa zewnętrzna
    public void run(){};

    public class InnerClass {
        // klasa wewnętrzba
        public void stop(){};
    }

    public InnerClass instance(){ //metoda zwracająca obiekt klasy wewnętrznej
        return new InnerClass();
    }
}
