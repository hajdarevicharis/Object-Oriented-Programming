package Lab07;

import Lab07.Task01.Classes.ClassLogger;
import Lab07.Task01.Classes.Logger;
import Lab07.Task01.Classes.RecordLogger;

public class main {
    public static void main(String[] args) {
        RecordLogger recordLogger = new RecordLogger("Haki");
        ClassLogger classLogger = new ClassLogger("haris");

        recordLogger.logMessage("ja sam haki");

        Logger recordLoggerLambda = (String message) -> {
                recordLogger.logMessage(message);
        };

        Logger classLoggerLambda = (String message) -> {
            classLogger.logMessage(message);
        };

    }
}
