package edu.sandiego.comp305;

/**
 * Main class
 */
public final class Main {
    private Main() {

    }

    /**
     * Main method
     * @param args
     */
    public static void main(final String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}
