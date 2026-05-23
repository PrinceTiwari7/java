/**
 * Problem ID: 20
 * Topic: FoundationalConcepts
 * Problem Name: CollectionsHashMapUsage
 * Difficulty: Easy
 * Description: Demonstrates HashMap operations including put, get, and keySet.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(N)
 */
import java.util.HashMap;
public class CollectionsHashMapUsage {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("Alice age: " + map.get("Alice"));
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
