/**
 * Problem ID: 133
 * Topic: SearchingAlgorithms
 * Problem Name: BinarySearchRecursive
 * Difficulty: Easy
 * Description: Recursive implementation of binary search.
 *
 * Time Complexity: O(log N)
 * Space Complexity: O(log N)
 */
public class BinarySearchRecursive {
    public static int search(int[] arr, int l, int r, int target) {
        if (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == target) return m;
            if (arr[m] > target) return search(arr, l, m - 1, target);
            return search(arr, m + 1, r, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        System.out.println("Index: " + search(arr, 0, arr.length - 1, 10));
    }
}
