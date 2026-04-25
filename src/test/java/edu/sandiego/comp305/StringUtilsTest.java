package edu.sandiego.comp305;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

/**
 * Tests for StringUtils.
 */
class StringUtilsTest {

    @Test
    void testReverseString() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void testReverseEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void testReverseNullString() {
        assertNull(StringUtils.reverseString(null));
    }

    @Test
    void testReverseSingleChar() {
        assertEquals("a", StringUtils.reverseString("a"));
    }
}