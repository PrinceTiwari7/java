/**
 * Problem ID: 146
 * Topic: AlgorithmDesignParadigms
 * Problem Name: DPClimbingStairs
 * Difficulty: Easy
 * Description: Calculates the number of ways to climb stairs using bottom-up DP.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class DPClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int first = 1, second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.println("Stairs 5: " + climbStairs(5));
    }
}
