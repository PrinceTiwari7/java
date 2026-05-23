public class ArrayFindMinMax {
    public static void printMinMax(int[] arr) {
        if (arr == null || arr.length == 0) return;
        int min = arr[0], max = arr[0];
        for (int n : arr) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 1, 5};
        printMinMax(arr);
    }
}
