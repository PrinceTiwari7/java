/**
 * Problem ID: 82
 * Topic: NonLinearDataStructures
 * Problem Name: CustomHashSet
 * Difficulty: Medium
 * Description: Implements a custom HashSet using bucket chaining.
 *
 * Time Complexity: O(1) average
 * Space Complexity: O(N)
 */
import java.util.LinkedList;
public class CustomHashSet {
    private LinkedList<Integer>[] buckets;
    private int capacity = 100;
    @SuppressWarnings("unchecked")
    public CustomHashSet() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) buckets[i] = new LinkedList<>();
    }
    private int hash(int key) { return Math.abs(key) % capacity; }
    public void add(int key) {
        int idx = hash(key);
        if (!buckets[idx].contains(key)) buckets[idx].add(key);
    }
    public void remove(int key) {
        int idx = hash(key);
        buckets[idx].remove((Integer) key);
    }
    public boolean contains(int key) {
        int idx = hash(key);
        return buckets[idx].contains(key);
    }
    public static void main(String[] args) {
        CustomHashSet set = new CustomHashSet();
        set.add(5); set.add(10);
        System.out.println("Contains 5: " + set.contains(5) + ", Contains 20: " + set.contains(20));
    }
}
