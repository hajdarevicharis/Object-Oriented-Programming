package Lab04.People;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
    private int credits;
    private int studentId;
    private List<Integer> grades;

    public Student(String name, String address, int studentId, int grades) {
        super(name, address);
        this.credits = 0;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int newStudentId){
        this.studentId = newStudentId;
    }

    public void addGrade(int grade) {
        if(isValidGrade(grade)) {
            grades.add(grade);
        } else {
            System.out.println("Invalid grade. Enter a grade betweeen 1 and 10");
        }
    }

    private boolean isValidGrade(int grade) {
        return grade >= 0 && grade <= 10;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return super.toString() + "\nStudent ID: " + studentId + "\nGrades: " + grades;
    }
    public void study() {
        credits += 1;
    }

}
