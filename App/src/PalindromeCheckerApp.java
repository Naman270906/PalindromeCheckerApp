public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase1PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 9: Recursive Palindrome Checker
     *
     * Description:
     * This class validates a palindrome using recursion.
     *
     * Characters are compared from the outer positions
     * moving inward using recursive calls.
     *
     * The recursion stops when:
     * - All characters are matched, OR
     * - A mismatch is found.
     *
     * This use case demonstrates divide-and-conquer
     * logic using method recursion.
     *
     * @author Naman Agarwal
     * @version 9.0
     */



        /**
         * Application entry point for UC9.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            String input = "madam";

            System.out.println("Input : " + input);

            boolean result = check(input, 0, input.length() - 1);

            System.out.println("Is Palindrome? : " + result);


        }

    private static boolean check(String s, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }
        return check(s, start + 1, end - 1);
    }
