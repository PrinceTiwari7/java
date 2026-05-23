/**
 * Problem ID: 16
 * Topic: FoundationalConcepts
 * Problem Name: BitPowerOfTwo
 * Difficulty: Easy
 * Description: Checks if a number is a power of two using bitwise AND.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class BitPowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println("Is 16 power of two: " + isPowerOfTwo(16));
    }
}
