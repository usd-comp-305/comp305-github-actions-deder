package edu.sandiego.comp305;

/**
 * Utility class for string
 */
public final class StringUtils {

    /**
     * Private constructor
     */
    private StringUtils() {
    }

    /**
     * Reverses the  string
     *
     * @param input the string to reverse
     * @return reversed string
     */
    public static String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}