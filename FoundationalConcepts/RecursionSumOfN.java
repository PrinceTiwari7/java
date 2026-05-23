/**
 * Problem ID: 9
 * Topic: FoundationalConcepts
 * Problem Name: RecursionSumOfN
 * Difficulty: Easy
 * Description: Finds the sum of the first N natural numbers recursively.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class RecursionSumOfN {
    public static int sum(int n) {
        if (n <= 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of first 10: " + sum(10));
    }
}
