/**
 * Problem ID: 3
 * Topic: FoundationalConcepts
 * Problem Name: QuadraticTimeComplexity
 * Difficulty: Easy
 * Description: Demonstrates O(N^2) time complexity with a nested loop search.
 *
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class QuadraticTimeComplexity {
    public static void printAllPairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print("(" + arr[i] + ", " + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printAllPairs(arr);
    }
}
