public class ArrayInsert {
    public static int[] insert(int[] arr, int val, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = val;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int[] res = insert(arr, 3, 2);
        for (int n : res) System.out.print(n + " ");
    }
}
