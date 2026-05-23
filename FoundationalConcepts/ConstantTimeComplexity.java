/**
 * Problem ID: 1
 * Topic: FoundationalConcepts
 * Problem Name: ConstantTimeComplexity
 * Difficulty: Easy
 * Description: Demonstrates O(1) time complexity by accessing an array element directly.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class ConstantTimeComplexity {
    public static int getFirstElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("First element: " + getFirstElement(arr));
    }
}
