/**
 * Problem ID: 83
 * Topic: NonLinearDataStructures
 * Problem Name: CustomHashMap
 * Difficulty: Medium
 * Description: Implements a custom HashMap using bucket chaining and key/value pairs.
 *
 * Time Complexity: O(1) average
 * Space Complexity: O(N)
 */
import java.util.LinkedList;
public class CustomHashMap {
    static class Entry {
        String key; int val;
        Entry(String key, int val) { this.key = key; this.val = val; }
    }
    private LinkedList<Entry>[] buckets;
    private int capacity = 16;
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) buckets[i] = new LinkedList<>();
    }
    private int hash(String key) { return Math.abs(key.hashCode()) % capacity; }
    public void put(String key, int val) {
        int idx = hash(key);
        for (Entry entry : buckets[idx]) {
            if (entry.key.equals(key)) {
                entry.val = val;
                return;
            }
        }
        buckets[idx].add(new Entry(key, val));
    }
    public int get(String key) {
        int idx = hash(key);
        for (Entry entry : buckets[idx]) {
            if (entry.key.equals(key)) return entry.val;
        }
        return -1;
    }
    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put("Alice", 25);
        map.put("Bob", 30);
        System.out.println("Alice age: " + map.get("Alice"));
    }
}
