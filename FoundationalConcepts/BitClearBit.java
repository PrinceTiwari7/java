/**
 * Problem ID: 15
 * Topic: FoundationalConcepts
 * Problem Name: BitClearBit
 * Difficulty: Easy
 * Description: Clears the bit at a specific position (sets to 0).
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class BitClearBit {
    public static int clearBit(int num, int pos) {
        return num & ~(1 << pos);
    }
    public static void main(String[] args) {
        System.out.println("Clearing position 2 of 5 (101): " + clearBit(5, 2));
    }
}
