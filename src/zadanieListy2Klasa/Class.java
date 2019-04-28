package zadanieListy2Klasa;

import java.util.ArrayList;
import java.util.List;

public class Class {

    List<String> students = new ArrayList<>();
    List<Student> academyStudents = new ArrayList<>();


    public void addStudent(String name) {
        students.add(name);
    }

    //overloadnig przeciążanie metod
    public void addStudent(Student student){
        academyStudents.add(student);
    }

    public void loadFirsStudents(List<Student> students){
        academyStudents.addAll(students);
    }

    public void displayStudents() {
        if (students.size() == 0) {
            System.out.print("This class has no students");
        } else {
            System.out.print("Students: ");
            for (int i = 0; i < students.size(); i++) {
                System.out.print(students.get(i));
                if (i < students.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print(".\n");
        }
    }

    public int getGirlsCount() {
        int girlsCount = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).endsWith("a")) {
                girlsCount++;
            }
        }
        return girlsCount;
    }

    public float getAverange() {

        int ageSum = 0;
        for (Student s: academyStudents){
            ageSum += s.getAge();
        }
        return (float) ageSum / academyStudents.size();
    }


}
