public class DoublyLinkedListDemo {
    static class DLLNode {
        int val; DLLNode prev, next;
        DLLNode(int val) { this.val = val; }
    }
    public static DLLNode insertAtHead(DLLNode head, int val) {
        DLLNode newNode = new DLLNode(val);
        if (head != null) {
            head.prev = newNode;
            newNode.next = head;
        }
        return newNode;
    }
    public static void printForwardAndBackward(DLLNode head) {
        DLLNode curr = head, last = null;
        System.out.print("Forward: ");
        while (curr != null) {
            System.out.print(curr.val + " ");
            last = curr;
            curr = curr.next;
        }
        System.out.print("\nBackward: ");
        while (last != null) {
            System.out.print(last.val + " ");
            last = last.prev;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DLLNode head = null;
        head = insertAtHead(head, 30);
        head = insertAtHead(head, 20);
        head = insertAtHead(head, 10);
        printForwardAndBackward(head);
    }
}
