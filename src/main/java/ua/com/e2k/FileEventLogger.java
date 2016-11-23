package ua.com.e2k;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by mezz on 23.11.16.
 */
public class FileEventLogger implements EventLogger {

    private String filename;

    public FileEventLogger() {
    }

    public FileEventLogger(String filename) {
        this.filename = filename;
    }

    private void init() throws IOException {
       if (!(new File(filename)).canWrite()) throw new IOException();
    }

    public void logEvent(Event event) {

        try {
            FileUtils.writeStringToFile(new File(filename),event.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
