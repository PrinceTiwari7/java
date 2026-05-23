public class ConstantTimeComplexity {
    public static int getFirstElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        return arr[0];
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("First element: " + getFirstElement(arr));
    }
}
