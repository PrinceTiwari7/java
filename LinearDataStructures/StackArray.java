public class StackArray {
    private int[] arr;
    private int top;
    private int capacity;
    public StackArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }
    public void push(int val) {
        if (top == capacity - 1) throw new StackOverflowError();
        arr[++top] = val;
    }
    public int pop() {
        if (top == -1) throw new RuntimeException("Stack underflow");
        return arr[top--];
    }
    public int peek() { return arr[top]; }
    public boolean isEmpty() { return top == -1; }
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(10); stack.push(20);
        System.out.println("Peek: " + stack.peek() + ", Pop: " + stack.pop());
    }
}
