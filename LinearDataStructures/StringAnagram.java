/**
 * Problem ID: 39
 * Topic: LinearDataStructures
 * Problem Name: StringAnagram
 * Difficulty: Easy
 * Description: Checks if two strings are anagrams of each other.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class StringAnagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] counts = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            counts[s1.charAt(i)]++;
            counts[s2.charAt(i)]--;
        }
        for (int count : counts) {
            if (count != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("listen vs silent: " + isAnagram("listen", "silent"));
    }
}
