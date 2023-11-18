package Lab07.Task01.Classes;

public class ClassLogger implements Logger {
    String name;

    public ClassLogger(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void logMessage(String message) {
        System.out.println(message + " - " + this.name);
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
