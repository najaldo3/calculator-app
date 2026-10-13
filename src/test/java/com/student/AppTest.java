package com.student;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
  void testMain() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        try (PrintStream testOut = new PrintStream(output)) {
            System.setOut(testOut);

            App.main(new String[]{});

            assertEquals("Hello World!", output.toString().trim());
        } finally {
            System.setOut(originalOut);
        }
    }
}