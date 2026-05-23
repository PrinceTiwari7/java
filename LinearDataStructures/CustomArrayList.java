/**
 * Problem ID: 33
 * Topic: LinearDataStructures
 * Problem Name: CustomArrayList
 * Difficulty: Medium
 * Description: Custom implementation of a resizing dynamic array.
 *
 * Time Complexity: O(1) amortized
 * Space Complexity: O(N)
 */
import java.util.Arrays;
public class CustomArrayList {
    private Object[] data;
    private int size = 0;
    public CustomArrayList() { data = new Object[2]; }
    public void add(Object element) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size++] = element;
    }
    public Object get(int idx) {
        if (idx < 0 || idx >= size) throw new IndexOutOfBoundsException();
        return data[idx];
    }
    public int size() { return size; }
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(10); list.add(20); list.add(30);
        System.out.println("Size: " + list.size() + ", Element 1: " + list.get(1));
    }
}
