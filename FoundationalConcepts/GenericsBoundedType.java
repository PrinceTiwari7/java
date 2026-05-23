/**
 * Problem ID: 25
 * Topic: FoundationalConcepts
 * Problem Name: GenericsBoundedType
 * Difficulty: Easy
 * Description: Demonstrates generics with bounded type parameters.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
public class GenericsBoundedType {
    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
    public static void main(String[] args) {
        System.out.println("Sum of double and int: " + add(5.5, 10));
    }
}
