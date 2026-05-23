/**
 * Problem ID: 36
 * Topic: LinearDataStructures
 * Problem Name: StringFirstUniqueChar
 * Difficulty: Easy
 * Description: Finds the index of the first non-repeating character in a string.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class StringFirstUniqueChar {
    public static int firstUniqChar(String s) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) counts[c - 'a']++;
        for (int i = 0; i < s.length(); i++) {
            if (counts[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Index: " + firstUniqChar("leetcode"));
    }
}
