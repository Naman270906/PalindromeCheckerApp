public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase1PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 3: Reverse String Based Palindrome Check
     *
     * Description:
     * This class checks whether a string is a palindrome
     * by reversing the string and comparing it with
     * the original value.
     *
     * At this stage, the application:
     * - Iterates the string in reverse order
     * - Builds a reversed version
     * - Compares original and reversed strings
     * - Displays the validation result
     *
     * This introduces transformation-based validation.
     *
     * @author Naman Agarwal
     * @version 2.0
     */



        /**
         * Application entry point for UC2.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            String original = "level";

            String reversed = "";

            for (int i = original.length() - 1; i >= 0; i--) {
                reversed = reversed + original.charAt(i);
            }

            if (original.equals(reversed)) {
                System.out.println(original + " is a Palindrome.");
            } else {
                System.out.println(original + " is NOT a Palindrome.");
            }
        }

}
