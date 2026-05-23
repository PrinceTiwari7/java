/**
 * Problem ID: 118
 * Topic: SortingAlgorithms
 * Problem Name: SortingAlgoVariant118
 * Difficulty: Easy
 * Description: Algorithmic variant sorting check #5.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class SortingAlgoVariant118 {
    public static void sort(int[] arr) {
        // Insertion sorting variant
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};
        sort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
