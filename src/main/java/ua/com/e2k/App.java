package ua.com.e2k;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by mezz on 23.11.16.
 */
public class App {
    private Client client;
    private EventLogger eventLogger;
    private Event event;

    public App() {
    }

    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String msg, Event event)
    {
        String message = msg.replaceAll(client.getId(), client.getFullName());
        event.setMsg(message);
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        App app = (App) ctx.getBean("app");

        Event event = (Event) ctx.getBean("event");
        app.logEvent("Some event for user 1", event);

    }
}
