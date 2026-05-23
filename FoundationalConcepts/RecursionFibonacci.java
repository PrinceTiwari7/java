/**
 * Problem ID: 8
 * Topic: FoundationalConcepts
 * Problem Name: RecursionFibonacci
 * Difficulty: Easy
 * Description: Calculates the Nth Fibonacci number using recursion.
 *
 * Time Complexity: O(2^N)
 * Space Complexity: O(N)
 */
public class RecursionFibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        System.out.println("Fibonacci of 6: " + fibonacci(6));
    }
}
