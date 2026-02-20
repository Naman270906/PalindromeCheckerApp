public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase1PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 4: Character Array Based Validation
     *
     * Description:
     * This class validates a palindrome by converting
     * the string into a character array and comparing
     * characters using the two-pointer technique.
     *
     * At this stage, the application:
     * - Converts string to char array
     * - Uses start and end pointers
     * - Compares characters efficiently
     * - Displays the result
     *
     * This reduces extra memory usage.
     *
     * @author Naman Agarwal
     * @version 2.0
     */



        /**
         * Application entry point for UC4.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char[] characters = input.toCharArray();

            int start = 0;
            int end = characters.length - 1;

            boolean isPalindrome = true;

            while (start < end) {
                if (characters[start] != characters[end]) {
                    isPalindrome = false;
                    break;
                }
                start++;
                end--;
            }

            if (isPalindrome) {
                System.out.println("The given string is a Palindrome.");
            } else {
                System.out.println("The given string is NOT a Palindrome.");
            }

            scanner.close();
        }

}
