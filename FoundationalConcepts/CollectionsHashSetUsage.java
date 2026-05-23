/**
 * Problem ID: 21
 * Topic: FoundationalConcepts
 * Problem Name: CollectionsHashSetUsage
 * Difficulty: Easy
 * Description: Demonstrates HashSet usage for unique elements.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(N)
 */
import java.util.HashSet;
public class CollectionsHashSetUsage {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate
        System.out.println("Set size (should be 2): " + set.size());
        System.out.println("Contains 20: " + set.contains(20));
    }
}
