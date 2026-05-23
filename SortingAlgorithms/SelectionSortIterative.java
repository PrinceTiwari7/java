/**
 * Problem ID: 107
 * Topic: SortingAlgorithms
 * Problem Name: SelectionSortIterative
 * Difficulty: Easy
 * Description: Sorts an array by repeatedly finding the minimum element.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class SelectionSortIterative {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) minIdx = j;
            }
            int temp = arr[minIdx]; arr[minIdx] = arr[i]; arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
