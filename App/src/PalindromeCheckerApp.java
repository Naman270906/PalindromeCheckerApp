public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase13PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 13: Performance Comparison
     *
     * Description:
     * This class measures and compares the execution
     * performance of different palindrome validation algorithms.
     *
     * Concepts Used:
     * - Strategy Pattern
     * - System.nanoTime()
     * - Algorithm Benchmarking
     *
     * @author Naman Agarwal
     * @version 13.0
     */



        /**
         * Application entry point for UC13.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Input : ");
            String input = scanner.nextLine();

            input = input.replaceAll("\\s+", "").toLowerCase();

            List<PalindromeStrategy> strategies = Arrays.asList(
                    new TwoPointerStrategy(),
                    new StackStrategy(),
                    new DequeStrategy()
            );

            for (PalindromeStrategy strategy : strategies) {

                long startTime = System.nanoTime();

                boolean result = strategy.checkPalindrome(input);

                long endTime = System.nanoTime();
                long executionTime = endTime - startTime;

                System.out.println("-----------------------------------");
                System.out.println("Algorithm : " + strategy.getClass().getSimpleName());
                System.out.println("Is Palindrome : " + result);
                System.out.println("Execution Time : " + executionTime + " ns");
            }

            scanner.close();
        }
}

/**
 * Strategy Interface
 */
interface PalindromeStrategy {
    boolean checkPalindrome(String input);
}

/**
 * Two Pointer Strategy (Fastest baseline approach)
 */
class TwoPointerStrategy implements PalindromeStrategy {

    @Override
    public boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

/**
 * Stack-Based Strategy
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
 * Deque-Based Strategy
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