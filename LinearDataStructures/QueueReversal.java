/**
 * Problem ID: 62
 * Topic: LinearDataStructures
 * Problem Name: QueueReversal
 * Difficulty: Easy
 * Description: Reverses a Queue using a Stack helper.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;
public class QueueReversal {
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) s.push(q.poll());
        while (!s.isEmpty()) q.add(s.pop());
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3);
        reverseQueue(q);
        System.out.println("Reversed Queue: " + q);
    }
}
