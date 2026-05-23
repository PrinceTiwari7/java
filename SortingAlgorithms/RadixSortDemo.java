/**
 * Problem ID: 113
 * Topic: SortingAlgorithms
 * Problem Name: RadixSortDemo
 * Difficulty: Hard
 * Description: LSD Radix Sort for integers.
 *
 * Time Complexity: O(D * (N + B))
 * Space Complexity: O(N + B)
 */
import java.util.Arrays;
public class RadixSortDemo {
    public static void sort(int[] arr) {
        if (arr.length == 0) return;
        int max = Arrays.stream(arr).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }
    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];
        for (int val : arr) count[(val / exp) % 10]++;
        for (int i = 1; i < 10; i++) count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};
        sort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
