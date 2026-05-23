/**
 * Problem ID: 10
 * Topic: FoundationalConcepts
 * Problem Name: RecursionPower
 * Difficulty: Easy
 * Description: Computes base^exp recursively.
 *
 * Time Complexity: O(exp)
 * Space Complexity: O(exp)
 */
public class RecursionPower {
    public static double power(double base, int exp) {
        if (exp == 0) return 1;
        if (exp < 0) return 1 / power(base, -exp);
        return base * power(base, exp - 1);
    }
    public static void main(String[] args) {
        System.out.println("2^5 = " + power(2, 5));
    }
}
