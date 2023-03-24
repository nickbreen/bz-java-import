package com.example;

import com.example.annotation.SomeAnnotation;

import java.io.PrintStream;

public class SomeApp {

    private PrintStream out;

    public SomeApp(final PrintStream out) {

        this.out = out;
    }

    private void write(final @SomeAnnotation long l) {
        out.println(l);
    }

    public static void main(String[] args) {
        final SomeApp someApp = new SomeApp(System.out);
        for (final String arg : args) {
            someApp.write(Long.parseLong(arg));
        }
    }
}
