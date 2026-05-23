public class TwoPointerPairWithSum {
    public static int[] findPair(int[] arr, int target) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == target) return new int[]{l, r};
            if (sum < target) l++;
            else r--;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] res = findPair(new int[]{1, 2, 3, 4, 6}, 6);
        System.out.println("Indices: " + res[0] + ", " + res[1]); // 1, 3
    }
}
