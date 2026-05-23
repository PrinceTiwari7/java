/**
 * Problem ID: 217
 * Topic: CommonCodingPatterns
 * Problem Name: SlidingWindowMaxSum
 * Difficulty: Easy
 * Description: Finds the maximum sum of a contiguous subarray of size K.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class SlidingWindowMaxSum {
    public static int getMaxSum(int[] arr, int k) {
        if (arr.length < k) return -1;
        int windowSum = 0;
        for (int i = 0; i < k; i++) windowSum += arr[i];
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Max Sum: " + getMaxSum(new int[]{2, 1, 5, 1, 3, 2}, 3)); // 9
    }
}
