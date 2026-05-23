/**
 * Problem ID: 35
 * Topic: LinearDataStructures
 * Problem Name: StringPalindrome
 * Difficulty: Easy
 * Description: Checks if a string reads the same backwards.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class StringPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("radar: " + isPalindrome("radar"));
    }
}
