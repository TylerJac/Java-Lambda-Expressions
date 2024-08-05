import java.util.function.Consumer;
public class LogMess {
    private static Consumer<String> logger = message -> System.out.println(message);
    public static void setLogger(Consumer<String> newLogger) {
        logger = newLogger;
    }
    public static void logMessage(String message) {
        logger.accept(message);
    }
    public static void main(String[] args) {
        logMessage("Hello, World!");
        setLogger((message) -> System.err.println(message));
        logMessage("Hello, World!");
    }
}
