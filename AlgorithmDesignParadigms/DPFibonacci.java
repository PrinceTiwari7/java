/**
 * Problem ID: 147
 * Topic: AlgorithmDesignParadigms
 * Problem Name: DPFibonacci
 * Difficulty: Easy
 * Description: Calculates Fibonacci using bottom-up DP.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class DPFibonacci {
    public static int fib(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main(String[] args) {
        System.out.println("Fib 10: " + fib(10));
    }
}
