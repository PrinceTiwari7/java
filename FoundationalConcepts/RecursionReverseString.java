public class RecursionReverseString {
    public static String reverse(String str) {
        if (str == null || str.length() <= 1) return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println("Reverse of 'hello': " + reverse("hello"));
    }
}
