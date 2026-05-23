public class CountingSortDemo {
    public static void sort(int[] arr) {
        int n = arr.length;
        if (n == 0) return;
        int max = arr[0], min = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
            if (val < min) min = val;
        }
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[n];
        for (int val : arr) count[val - min]++;
        for (int i = 1; i < range; i++) count[i] += count[i - 1];
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        System.arraycopy(output, 0, arr, 0, n);
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        sort(arr);
        for (int n : arr) System.out.print(n + " ");
    }
}
