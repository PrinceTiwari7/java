public class BitGetBit {
    public static int getBit(int num, int pos) {
        return (num >> pos) & 1;
    }
    public static void main(String[] args) {
        System.out.println("Bit at position 2 of 5 (101): " + getBit(5, 2));
    }
}
