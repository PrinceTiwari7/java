/**
 * Problem ID: 11
 * Topic: FoundationalConcepts
 * Problem Name: RecursionReverseString
 * Difficulty: Easy
 * Description: Reverses a string using recursive calls.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class RecursionReverseString {
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println("Reverse of 'hello': " + reverse("hello"));
    }
}
