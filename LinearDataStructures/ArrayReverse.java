/**
 * Problem ID: 28
 * Topic: LinearDataStructures
 * Problem Name: ArrayReverse
 * Difficulty: Easy
 * Description: Reverses an array in-place using the two-pointer approach.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class ArrayReverse {
    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
