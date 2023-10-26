package Lab04;
import Lab04.People.Person;
import Lab04.People.Student;
import Lab04.People.Teacher;
import Lab04.task2.Circle;
import Lab04.task2.FillType;
import Lab04.task2.Rectangle;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class lab04 {
    public static void main(String[] args) {
        Circle krug = new Circle("Red", FillType.FILLED, 10);
        Rectangle rect = new Rectangle("Blue", FillType.FILLED, 10,5);




        Student haris = new Student("Haris","Brcanska",5, 8);

        System.out.println("Informacije: ");
        haris.addGrade(9);
        haris.addGrade(3);
        System.out.println(haris.getGrades());

    }
}