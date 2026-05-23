/**
 * Problem ID: 4
 * Topic: FoundationalConcepts
 * Problem Name: LogarithmicTimeComplexity
 * Difficulty: Easy
 * Description: Demonstrates O(log N) time complexity using binary search division.
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(1)
 */
public class LogarithmicTimeComplexity {
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        System.out.println("Index of 8: " + binarySearch(arr, 8));
    }
}
