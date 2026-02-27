public class PalindromeCheckerApp {
    /**
     * ==========================================================
     * MAIN CLASS – UseCase1PalindromeCheckerApp
     * ==========================================================
     *
     * Use Case 8: Linked List Based Palindrome Checker
     *
     * Description:
     * This class checks whether a string is a palindrome
     * using a Singly Linked List.
     *
     * Flow:
     * 1. Convert string to linked list
     * 2. Find middle using fast & slow pointers
     * 3. Reverse second half (in-place)
     * 4. Compare both halves
     *
     * Key Concepts:
     * - Singly Linked List
     * - Node Traversal
     * - Fast and Slow Pointer Technique
     * - In-Place Reversal
     *
     * @author Naman Agarwal
     * @version 8.0
     */



        /**
         * Application entry point for UC8.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            String input = "madam";

            System.out.println("Input String: " + input);

            Node head = createLinkedList(input);

            if (isPalindrome(head)) {
                System.out.println("Result: The string is a Palindrome.");
            } else {
                System.out.println("Result: The string is NOT a Palindrome.");
            }
        }
