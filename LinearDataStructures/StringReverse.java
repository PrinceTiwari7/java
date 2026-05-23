public class StringReverse {
    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++; j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
    }
}
