public class TernarySearchRecursive {
    public static int search(int[] arr, int l, int r, int target) {
        if (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (arr[mid1] == target) return mid1;
            if (arr[mid2] == target) return mid2;
            if (target < arr[mid1]) return search(arr, l, mid1 - 1, target);
            else if (target > arr[mid2]) return search(arr, mid2 + 1, r, target);
            else return search(arr, mid1 + 1, mid2 - 1, target);
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Index: " + search(arr, 0, arr.length - 1, 5));
    }
}
