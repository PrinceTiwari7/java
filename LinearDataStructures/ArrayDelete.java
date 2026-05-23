public class ArrayDelete {
    public static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return arr;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) continue;
            newArr[j++] = arr[i];
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 3};
        int[] res = delete(arr, 2);
        for (int n : res) System.out.print(n + " ");
    }
}
