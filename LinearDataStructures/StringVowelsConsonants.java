/**
 * Problem ID: 40
 * Topic: LinearDataStructures
 * Problem Name: StringVowelsConsonants
 * Difficulty: Easy
 * Description: Counts the number of vowels and consonants in a string.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class StringVowelsConsonants {
    public static void count(String s) {
        int v = 0, c = 0;
        s = s.toLowerCase();
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
    public static void main(String[] args) {
        count("Hello World!");
    }
}
