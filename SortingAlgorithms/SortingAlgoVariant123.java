public class SortingAlgoVariant123 {
    public static void sort(int[] arr) {
        // Insertion sorting variant
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i], j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 4};
        sort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
