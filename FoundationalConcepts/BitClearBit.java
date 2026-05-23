public class BitClearBit {
    public static int clearBit(int num, int pos) {
        return num & ~(1 << pos);
    }
    public static void main(String[] args) {
        System.out.println("Clearing position 2 of 5 (101): " + clearBit(5, 2));
    }
}
