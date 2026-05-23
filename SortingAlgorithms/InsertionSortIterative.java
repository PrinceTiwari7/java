/**
 * Problem ID: 108
 * Topic: SortingAlgorithms
 * Problem Name: InsertionSortIterative
 * Difficulty: Easy
 * Description: Standard iterative insertion sort.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class InsertionSortIterative {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        insertionSort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
