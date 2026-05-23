/**
 * Problem ID: 37
 * Topic: LinearDataStructures
 * Problem Name: StringCompression
 * Difficulty: Medium
 * Description: Compresses a string by replacing repeating characters with count.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class StringCompression {
    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                sb.append(s.charAt(i)).append(count);
                count = 1;
            }
        }
        return sb.length() < s.length() ? sb.toString() : s;
    }
    public static void main(String[] args) {
        System.out.println(compress("aabcccccaaa"));
    }
}
