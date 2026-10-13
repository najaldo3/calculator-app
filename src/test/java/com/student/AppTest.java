
package com.student;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testMain() {
        Logger logger = Logger.getLogger(App.class.getName());
        StringBuilder output = new StringBuilder();

        Handler handler = new Handler() {
            @Override
            public void publish(LogRecord logRecord) {
                output.append(logRecord.getMessage());
            }

            @Override
            public void flush() {
                // No buffering is used, so flushing is unnecessary.
            }

            @Override
            public void close() {
                // No resources need to be closed.
            }
        };

        logger.addHandler(handler);

        try {
            App.main(new String[]{});
            assertEquals("Hello World!", output.toString());
        } finally {
            logger.removeHandler(handler);
        }
    }
}
