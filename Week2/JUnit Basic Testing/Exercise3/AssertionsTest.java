package com.example.JUnitDemo;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        assertEquals("Expected 2 + 3 to equal 5", 5, 2 + 3);

        assertTrue("Expected 5 to be greater than 3", 5 > 3);

        assertFalse("Expected 5 to not be less than 3", 5 < 3);

        assertNull("Expected value to be null", null);

        assertNotNull("Expected object to be not null", new Object());
    }
}
