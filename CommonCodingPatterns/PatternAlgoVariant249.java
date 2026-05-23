public class PatternAlgoVariant249 {
    public static int[] twoSum(int[] arr, int target) {
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
        int[] res = twoSum(new int[]{1, 2, 4, 7}, 6);
        System.out.println("Pair found: " + (res[0] != -1));
    }
}
