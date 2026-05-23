/**
 * Problem ID: 166
 * Topic: AlgorithmDesignParadigms
 * Problem Name: ParadigmAlgoVariant166
 * Difficulty: Medium
 * Description: Algorithmic design paradigm check #14.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class ParadigmAlgoVariant166 {
    public static int fib(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 0; dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
}
