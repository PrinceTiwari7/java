/**
 * Problem ID: 14
 * Topic: FoundationalConcepts
 * Problem Name: BitSetBit
 * Difficulty: Easy
 * Description: Sets the bit at a specific position to 1.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class BitSetBit {
    public static int setBit(int num, int pos) {
        return num | (1 << pos);
    }
    public static void main(String[] args) {
        System.out.println("Setting position 1 of 5 (101) to 1: " + setBit(5, 1));
    }
}
