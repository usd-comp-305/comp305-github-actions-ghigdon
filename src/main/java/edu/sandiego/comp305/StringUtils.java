package edu.sandiego.comp305;

/**
 * String Utility class
 */
public final class StringUtils {
    private StringUtils() {

    }

    /**
     * Reverses a string
     * @param str the string to be reversed
     * @return the reversed string
     */
    public static String reverseString(final String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        final StringBuilder reversed = new StringBuilder();
        for (int i = str.length() -1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
