package Lab07.Task01.Classes;

public record RecordLogger(String name) implements Logger {
    public void logMessage(String message) {
        System.out.println(message + " " + " - " + this.name);
    }

}
