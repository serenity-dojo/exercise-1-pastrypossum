package com.serenitydojo.datatypes;

import com.serenitydojo.HelloWorldWriter;
import org.junit.Test;

public class HelloWorldWriteTest {

    @Test
    public void shouldWriteHellowWorldToTheConsole() {

        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }
}
