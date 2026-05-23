import java.util.Stack;
public class MinStack {
    private Stack<Integer> stack = new Stack<>();
    private Stack<Integer> minStack = new Stack<>();
    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    public void pop() {
        if (stack.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }
    public int top() { return stack.peek(); }
    public int getMin() { return minStack.peek(); }
    public static void main(String[] args) {
        MinStack s = new MinStack();
        s.push(-2); s.push(0); s.push(-3);
        System.out.println("Min: " + s.getMin()); // -3
        s.pop();
        System.out.println("Top: " + s.top() + ", Min: " + s.getMin()); // -2
    }
}
