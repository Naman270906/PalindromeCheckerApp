public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase1PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 11: Object-Oriented Palindrome Service
     *
     * Description:
     * This class demonstrates palindrome validation using
     * object-oriented design principles.
     *
     * The palindrome logic is encapsulated inside a
     * PalindromeService class.
     *
     * @author Naman Agarwal
     * @version 11.0
     */



        /**
         * Application entry point for UC11.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to check palindrome: ");
            String input = scanner.nextLine();

            PalindromeService service = new PalindromeService();
            boolean result = service.checkPalindrome(input);

            if (result) {
                System.out.println("Result: The string is a palindrome.");
            } else {
                System.out.println("Result: The string is NOT a palindrome.");
            }

            scanner.close();
        }
}