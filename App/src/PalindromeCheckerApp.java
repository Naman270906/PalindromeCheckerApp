public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase12PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 12: Strategy Pattern for Palindrome Algorithms
     *
     * Description:
     * This class demonstrates how different palindrome
     * validation algorithms can be selected dynamically
     * at runtime using the Strategy Design Pattern.
     *
     * Concepts Used:
     * - Interface
     * - Polymorphism
     * - Strategy Pattern
     * - Stack and Deque Data Structures
     *
     * @author Naman Agarwal
     * @version 12.0
     */



        /**
         * Application entry point for UC12.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose Palindrome Strategy:");
            System.out.println("1. Stack Strategy");
            System.out.println("2. Deque Strategy");
            System.out.print("Enter choice (1 or 2): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            input = input.replaceAll("\\s+", "").toLowerCase();

            PalindromeStrategy strategy;

            if (choice == 1) {
                strategy = new StackStrategy();
            } else {
                strategy = new DequeStrategy();
            }

            boolean result = strategy.checkPalindrome(input);

            if (result) {
                System.out.println("Result: The string is a palindrome.");
            } else {
                System.out.println("Result: The string is NOT a palindrome.");
            }

            scanner.close();
        }
}

/**
 * ============================================================
 * INTERFACE - PalindromeStrategy
 * ============================================================
 *
 * Defines a contract for all palindrome algorithms.
 */
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/**
 * ============================================================
 * CLASS - StackStrategy
 * ============================================================
 *
 * Uses Stack data structure.
 */
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

/**
 * ============================================================
 * CLASS - DequeStrategy
 * ============================================================
 *
 * Uses Deque data structure.
 */
class DequeStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }