/**
 * Problem ID: 12
 * Topic: FoundationalConcepts
 * Problem Name: RecursionPalindrome
 * Difficulty: Easy
 * Description: Checks if a string is a palindrome recursively.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class RecursionPalindrome {
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) return true;
        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        return isPalindrome(str.substring(1, str.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println("is 'racecar' palindrome: " + isPalindrome("racecar"));
    }
}
