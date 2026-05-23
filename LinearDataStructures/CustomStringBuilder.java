import java.util.Arrays;
public class CustomStringBuilder {
    private char[] value;
    private int count = 0;
    public CustomStringBuilder() { value = new char[16]; }
    public CustomStringBuilder append(String str) {
        if (str == null) return this;
        int len = str.length();
        ensureCapacity(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
    }
    private void ensureCapacity(int cap) {
        if (cap > value.length) {
            value = Arrays.copyOf(value, Math.max(value.length * 2, cap));
        }
    }
    public String toString() { return new String(value, 0, count); }
    public static void main(String[] args) {
        CustomStringBuilder csb = new CustomStringBuilder();
        csb.append("Hello ").append("Custom SB!");
        System.out.println(csb.toString());
    }
}
