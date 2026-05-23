/**
 * Problem ID: 17
 * Topic: FoundationalConcepts
 * Problem Name: BitCountSetBits
 * Difficulty: Easy
 * Description: Counts the number of set bits (1s) in an integer.
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */
public class BitCountSetBits {
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Set bits in 15 (1111): " + countSetBits(15));
    }
}
