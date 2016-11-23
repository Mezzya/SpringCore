package ua.com.e2k;

import javafx.scene.input.DataFormat;

import java.text.DateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by mezz on 23.11.16.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    public Event() {
    }

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df=df;

        Random random = new Random(1000);
        this.id = random.nextInt();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
