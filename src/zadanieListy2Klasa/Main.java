package zadanieListy2Klasa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Class c = new Class();
        c.displayStudents(); //has empty list

        c.addStudent("Tomasz");
        c.addStudent("Ania");
        c.addStudent("Ola");
        c.addStudent("Andrzej");
//        c.students.add("Ola");
//        c.students.add("Andrzej");
//        c.students.add("Aneta");
//        c.students.add("Mariusz");

        c.displayStudents();

        int gc = c.getGirlsCount();
        System.out.println(gc); //sposób 1
        //System.out.println(c.getGirlsCount()); //sposób 2

        //extras
        c.loadFirsStudents(Arrays.asList(
                new Student("Tomasz", 23),
                new Student("Ania", 20),
                new Student("Marek", 25)
        ));

//        List<Student> students = new ArrayList<>();
//        c.loadFirsStudents(students);

        float average = c.getAverange();
        System.out.println(average);
    }
}
