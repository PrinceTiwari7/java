public class LinearSearchIterative {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Index of 5: " + search(new int[]{2, 3, 5, 8}, 5));
    }
}
