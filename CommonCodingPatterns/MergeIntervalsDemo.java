import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class MergeIntervalsDemo {
    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> res = new ArrayList<>();
        int[] curr = intervals[0];
        res.add(curr);
        for (int[] next : intervals) {
            if (curr[1] >= next[0]) {
                curr[1] = Math.max(curr[1], next[1]);
            } else {
                curr = next;
                res.add(curr);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
    public static void main(String[] args) {
        int[][] res = merge(new int[][]{{1,3}, {2,6}, {8,10}});
        for (int[] r : res) System.out.print("[" + r[0] + "," + r[1] + "] ");
    }
}
