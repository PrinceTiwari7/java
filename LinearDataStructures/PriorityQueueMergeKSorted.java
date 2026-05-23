/**
 * Problem ID: 60
 * Topic: LinearDataStructures
 * Problem Name: PriorityQueueMergeKSorted
 * Difficulty: Hard
 * Description: Merges K sorted lists using a PriorityQueue.
 *
 * Time Complexity: O(N log K)
 * Space Complexity: O(K)
 */
import java.util.PriorityQueue;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class PriorityQueueMergeKSorted {
    public static List<Integer> mergeK(List<List<Integer>> lists) {
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < lists.size(); i++) {
            if (!lists.get(i).isEmpty()) {
                pq.add(new Element(lists.get(i).get(0), i, 0));
            }
        }
        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty()) {
            Element curr = pq.poll();
            res.add(curr.val);
            if (curr.elemIdx + 1 < lists.get(curr.listIdx).size()) {
                pq.add(new Element(lists.get(curr.listIdx).get(curr.elemIdx + 1), curr.listIdx, curr.elemIdx + 1));
            }
        }
        return res;
    }
    static class Element {
        int val, listIdx, elemIdx;
        Element(int val, int listIdx, int elemIdx) {
            this.val = val; this.listIdx = listIdx; this.elemIdx = elemIdx;
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1, 4, 7));
        lists.add(Arrays.asList(2, 5, 8));
        lists.add(Arrays.asList(3, 6, 9));
        System.out.println("Merged: " + mergeK(lists));
    }
}
