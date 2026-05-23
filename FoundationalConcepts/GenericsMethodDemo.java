/**
 * Problem ID: 24
 * Topic: FoundationalConcepts
 * Problem Name: GenericsMethodDemo
 * Difficulty: Easy
 * Description: Demonstrates a generic method to print arrays of different types.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class GenericsMethodDemo {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"A", "B", "C"};
        printArray(intArray);
        printArray(stringArray);
    }
}
