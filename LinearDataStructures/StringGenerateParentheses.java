/**
 * Problem ID: 63
 * Topic: LinearDataStructures
 * Problem Name: StringGenerateParentheses
 * Difficulty: Medium
 * Description: Generates all combinations of well-formed parentheses.
 *
 * Time Complexity: O(4^N / sqrt(N))
 * Space Complexity: O(N)
 */
import java.util.List;
import java.util.ArrayList;
public class StringGenerateParentheses {
    public static List<String> generate(int n) {
        List<String> res = new ArrayList<>();
        backtrack(res, "", 0, 0, n);
        return res;
    }
    private static void backtrack(List<String> res, String curr, int open, int close, int max) {
        if (curr.length() == max * 2) {
            res.add(curr);
            return;
        }
        if (open < max) backtrack(res, curr + "(", open + 1, close, max);
        if (close < open) backtrack(res, curr + ")", open, close + 1, max);
    }
    public static void main(String[] args) {
        System.out.println("Parentheses combos for N=3: " + generate(3));
    }
}
