/**
 * Problem ID: 52
 * Topic: LinearDataStructures
 * Problem Name: StackLinkedList
 * Difficulty: Easy
 * Description: Implements a LIFO stack using a Singly Linked List.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(N)
 */
public class StackLinkedList {
    static class Node {
        int val; Node next;
        Node(int val) { this.val = val; }
    }
    private Node top = null;
    public void push(int val) {
        Node newNode = new Node(val);
        newNode.next = top;
        top = newNode;
    }
    public int pop() {
        if (top == null) throw new RuntimeException("Stack empty");
        int val = top.val;
        top = top.next;
        return val;
    }
    public int peek() { return top.val; }
    public boolean isEmpty() { return top == null; }
    public static void main(String[] args) {
        StackLinkedList s = new StackLinkedList();
        s.push(100); s.push(200);
        System.out.println(s.peek() + " " + s.pop());
    }
}
