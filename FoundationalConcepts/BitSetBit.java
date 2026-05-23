public class BitSetBit {
    public static int setBit(int num, int pos) {
        return num | (1 << pos);
    }
    public static void main(String[] args) {
        System.out.println("Setting position 1 of 5 (101) to 1: " + setBit(5, 1));
    }
}
