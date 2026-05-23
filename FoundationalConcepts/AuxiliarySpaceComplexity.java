/**
 * Problem ID: 6
 * Topic: FoundationalConcepts
 * Problem Name: AuxiliarySpaceComplexity
 * Difficulty: Easy
 * Description: Demonstrates O(N) space complexity by allocating a duplicate array.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class AuxiliarySpaceComplexity {
    public static int[] duplicate(int[] arr) {
        int[] dup = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dup[i] = arr[i];
        }
        return dup;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] dup = duplicate(arr);
        System.out.println("Duplicated size: " + dup.length);
    }
}
