/**
 * Problem ID: 31
 * Topic: LinearDataStructures
 * Problem Name: ArrayMoveZeroes
 * Difficulty: Easy
 * Description: Moves all zeroes to the end of the array while maintaining order.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class ArrayMoveZeroes {
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[pos++] = num;
            }
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
