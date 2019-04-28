package zadanieZoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bear bear = new Bear("Yogi", 200, 40);
        Tiger tiger = new Tiger("Jataka", 150, 25);
        Wolf wolf = new Wolf("Howler", 70, 40);
        Dog dog = new Dog("Scooby", 30);

        //Sposób pierwszy
        List<Animal> animals = new ArrayList<>();
        animals.add(bear);
        animals.add(tiger);
        animals.add(wolf);
        animals.add(dog);

        // Sposób drugi
//        List<Animal> animals2 = Arrays.asList(
//                new Bear("Yogi", 200, 40),
//                new Tiger("Jataka", 150, 25),
//                new Wolf("Howler", 70, 40),
//                new Dog("Scooby", 30)
//        );

        //Sposób trzeci
        //animals.add(new Bear("oldBear", 350, 50));

        //sposób 1 iteracji for i

//        for (int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i));
//        }

        //sposób 2 iteracji for each
        for (Animal a: animals){
            System.out.println(a.getId() + " : ");
            a.introduce();
        }

        //Sposób 3 na iteracje
        //animals.forEach(System.out::println);


        List<Cannie> howlers = Arrays.asList(wolf, dog);
        for (Cannie c: howlers){
            if(c instanceof Animal){
                Animal a = (Animal) c; //rzutowanie
                System.out.print("My name is "
                        + a.getName()
                        + " and am barking: ");
            }
            c.bark();

            if (c instanceof Dog){
                Dog d = (Dog) c;
                d.sitPretty();
            }

        }

    }//main
}//class
