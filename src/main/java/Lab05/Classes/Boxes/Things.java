package Lab05.Classes.Boxes;

public class Things {
    private String name;
    private double weight;

    public double weight() {
        return this.weight;
    }

    public String getName() {
        return this.name;
    }

    public Things(String name, double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException();
        }
        this.name = name;
    }


    public Things(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
