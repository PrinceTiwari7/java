/**
 * Problem ID: 7
 * Topic: FoundationalConcepts
 * Problem Name: RecursionFactorial
 * Difficulty: Easy
 * Description: Calculates the factorial of a number using recursion.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class RecursionFactorial {
    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
