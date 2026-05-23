/**
 * Problem ID: 106
 * Topic: SortingAlgorithms
 * Problem Name: BubbleSortIterative
 * Difficulty: Easy
 * Description: Standard iterative bubble sort implementation.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class BubbleSortIterative {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; arr[j] = arr[j + 1]; arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22};
        bubbleSort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
