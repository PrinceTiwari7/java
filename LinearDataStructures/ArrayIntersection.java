/**
 * Problem ID: 61
 * Topic: LinearDataStructures
 * Problem Name: ArrayIntersection
 * Difficulty: Easy
 * Description: Finds intersection of two arrays using a HashSet.
 *
 * Time Complexity: O(N+M)
 * Space Complexity: O(Min(N,M))
 */
import java.util.HashSet;
import java.util.ArrayList;
public class ArrayIntersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums1) set.add(n);
        HashSet<Integer> intersect = new HashSet<>();
        for (int n : nums2) {
            if (set.contains(n)) intersect.add(n);
        }
        int[] res = new int[intersect.size()];
        int idx = 0;
        for (int n : intersect) res[idx++] = n;
        return res;
    }
    public static void main(String[] args) {
        int[] res = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int n : res) System.out.print(n + " ");
    }
}
