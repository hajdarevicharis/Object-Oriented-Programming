package Lab04.task2;

import java.lang.reflect.Constructor;

public class Shape {
    public String color;
    public FillType filled;
    public double radius;

    public Shape(String Color, FillType filled){
        this.color = Color;
        this.filled = filled;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: "+ (this.filled == FillType.FILLED ? "Filled" : "Not filled"));
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

}
