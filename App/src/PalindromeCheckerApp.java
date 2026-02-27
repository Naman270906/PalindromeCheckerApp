public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase1PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 10: Normalized Palindrome Validation
     *
     * Description:
     * This class validates a palindrome after preprocessing
     * the input string.
     *
     * Normalization includes:
     * - Removing spaces and symbols
     * - Converting to lowercase
     *
     * Example:
     * "A man a plan a canal Panama"
     *
     * @author Naman Agarwal
     * @version 10.0
     */



        /**
         * Application entry point for UC10.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            String input = "A man a plan a canal Panama";

            System.out.println("Original Input : " + input);

            String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            System.out.println("Normalized Input : " + normalized);

            boolean isPalindrome = true;

            for (int i = 0; i < normalized.length() / 2; i++) {
                if (normalized.charAt(i) !=
                        normalized.charAt(normalized.length() - 1 - i)) {

                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Is Palindrome? : " + isPalindrome);
        }
