public class AuxiliarySpaceComplexity {
    public static int[] duplicate(int[] arr) {
        int[] dup = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            dup[i] = arr[i];
        }
        return dup;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] dup = duplicate(arr);
        System.out.println("Duplicated size: " + dup.length);
    }
}
