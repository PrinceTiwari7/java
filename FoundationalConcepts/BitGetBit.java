/**
 * Problem ID: 13
 * Topic: FoundationalConcepts
 * Problem Name: BitGetBit
 * Difficulty: Easy
 * Description: Retrieves the value of the bit at a specific position.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class BitGetBit {
    public static int getBit(int num, int pos) {
        return (num >> pos) & 1;
    }
    public static void main(String[] args) {
        System.out.println("Bit at position 2 of 5 (101): " + getBit(5, 2));
    }
}
