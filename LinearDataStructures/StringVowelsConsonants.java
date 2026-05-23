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
