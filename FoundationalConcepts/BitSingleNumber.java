/**
 * Problem ID: 18
 * Topic: FoundationalConcepts
 * Problem Name: BitSingleNumber
 * Difficulty: Easy
 * Description: Finds the single number in an array where all other numbers appear twice.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class BitSingleNumber {
    public static int findSingle(int[] nums) {
        int xor = 0;
        for (int num : nums) xor ^= num;
        return xor;
    }
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println("Single number: " + findSingle(nums));
    }
}
