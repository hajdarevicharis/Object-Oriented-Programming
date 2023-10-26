package Lab04.task2;

public class Circle extends Shape{
    public double radius;
    private double PI = 3.14;

    public Circle(String Color, FillType filled, double radius) {
        super(Color, filled);
        this.radius = radius;
    }



    @Override
    public void displayInfo() {
        System.out.println("Color: " + this.color);
        System.out.println("Filled: "+ (this.filled == FillType.FILLED ? "Filled" : "Not filled"));
        System.out.println("Radius: "+this.radius);
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }
}
