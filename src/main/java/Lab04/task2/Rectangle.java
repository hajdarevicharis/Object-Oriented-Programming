package Lab04.task2;

import java.awt.*;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(String Color,FillType filled ,double width, double height) {
        super(Color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayInfo() {
        System.out.println("Color: " + this.color);
        System.out.println("Filled: "+ (this.filled == FillType.FILLED ? "Filled" : "Not filled"));
        System.out.println("Width: "+ this.width);
        System.out.println("Height: "+ this.height);
    }
}
