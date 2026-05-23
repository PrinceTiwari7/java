/**
 * Problem ID: 2
 * Topic: FoundationalConcepts
 * Problem Name: LinearTimeComplexity
 * Difficulty: Easy
 * Description: Demonstrates O(N) time complexity by searching for an element in an array.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class LinearTimeComplexity {
    public static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Contains 3: " + contains(arr, 3));
    }
}
