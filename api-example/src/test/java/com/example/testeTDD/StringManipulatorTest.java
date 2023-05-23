package com.example.testeTDD;

import com.example.StringManipulator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulatorTest {

    @Test
    public void testConcatenate() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.concatenate("Hello", "World");
        assertEquals("HelloWorld", result);
    }

    @Test
    public void testConvertToUppercase() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.convertToUppercase("hello");
        assertEquals("HELLO", result);
    }

    @Test
    public void testReverse() {
        StringManipulator manipulator = new StringManipulator();
        String result = manipulator.reverse("hello");
        assertEquals("olleh", result);
    }
}
