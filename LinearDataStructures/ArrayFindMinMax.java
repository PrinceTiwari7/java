/**
 * Problem ID: 29
 * Topic: LinearDataStructures
 * Problem Name: ArrayFindMinMax
 * Difficulty: Easy
 * Description: Finds the minimum and maximum elements in an array.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class ArrayFindMinMax {
    public static void printMinMax(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};
        printMinMax(arr);
    }
}
