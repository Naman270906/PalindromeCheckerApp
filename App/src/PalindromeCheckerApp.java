public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase1PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 6: Queue + Stack Fairness Check
     *
     * Description:
     * This class demonstrates palindrome validation using
     * two different data structures:
     *
     * - Queue (FIFO - First In First Out)
     * - Stack (LIFO - Last In First Out)
     *
     * Characters are inserted into both structures and then
     * compared by removing from the front of the queue and
     * the top of the stack.
     *
     * If all characters match, the input string is confirmed
     * as a palindrome.
     *
     * @author Naman Agarwal
     * @version 6.0
     */



        /**
         * Application entry point for UC6.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            String input = "level";

            Queue<Character> queue = new LinkedList<>();

            Stack<Character> stack = new Stack<>();

            for (char c : input.toCharArray()) {
                queue.add(c);
                stack.push(c);
            }

            boolean isPalindrome = true;

            while (!queue.isEmpty()) {
                char fromQueue = queue.remove();
                char fromStack = stack.pop();

                if (fromQueue != fromStack) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println(input + " is a Palindrome.");
            } else {
                System.out.println(input + " is NOT a Palindrome.");
            }
        }

}
