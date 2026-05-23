/**
 * Problem ID: 23
 * Topic: FoundationalConcepts
 * Problem Name: GenericsClassDemo
 * Difficulty: Easy
 * Description: Demonstrates a generic class that acts as a Box wrapper.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class GenericsClassDemo {
    public static class Box<T> {
        private T content;
        public void set(T content) { this.content = content; }
        public T get() { return content; }
    }
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println("Box contents: " + stringBox.get());
    }
}
