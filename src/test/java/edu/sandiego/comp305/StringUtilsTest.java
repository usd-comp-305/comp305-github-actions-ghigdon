package edu.sandiego.comp305;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests for StringUtils class
 */
public final class StringUtilsTest {
    /**
     * Test reversing a string
     */
    @Test
    public void testReverseString() {
        assertEquals("nreyab", StringUtils.reverseString("bayern"));
    }

    /**
     * Test reversing an empty string
     */
    @Test
    public void testReverseStringEmpty() {
        assertEquals("", StringUtils.reverseString(""));
    }

    /**
     * Test reversing a single character
     */
    @Test
    public void testReverseStringSingleChar() {
        assertEquals("a", StringUtils.reverseString("a"));
    }

    /**
     * Test reversing a string with spaces
     */
    @Test
    public void testReverseStringWithSpaces() {
        assertEquals("snoipmahC eugaeL",
                StringUtils.reverseString("hello world"));
    }
}

