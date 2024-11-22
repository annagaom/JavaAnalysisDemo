import java.util.logging.Logger;
/**
 * Main class for demonstrating Checkstyle issues and corrections.
 */
@SuppressWarnings("checkstyle:Indentation")
public class Main {


    /**
     * The main method serves as the entry point for the program.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // Example 2: Performance issue - loop improvement
        for (int i = 0; i < 1000; i++) {
            Logger logger = Logger.getLogger(Main.class.getName());
            logger.info(String.valueOf(i));
        }

        // Example 3: PMD - Initialize instance variable properly
        User user = new User("Default Name"); // Ensure User class has a parameterized constructor
    }

    /**
     * Divides two integers and prints the result.
     *
     * @param a the dividend
     * @param b the divisor
     */
    public static void divide(int a, int b) {
        Logger logger = null;
        if (b == 0) {
            logger = Logger.getLogger(Main.class.getName());
            logger.info("Error: Division by zero is not allowed.");
            return;
        }
        logger.info(String.valueOf(a / b));
    }
}
