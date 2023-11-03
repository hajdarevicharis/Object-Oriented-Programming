package Lab05.Classes;

public class Book implements toBeStored{
    String writer;
    String name;
    double weight;

    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
    }

    public String toString() {
        return "Writer: " + writer + "\nName: " + name + "\nWeight: " + weight;
    }
}
