package ua.com.e2k;

/**
 * Created by mezz on 23.11.16.
 */
public class ConsoleEventLogger implements EventLogger {

    public ConsoleEventLogger() {
    }

    public void logEvent(Event event) {
            System.out.println(event);

    }
}
