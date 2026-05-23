public class FenwickTreeDemo {
    private int[] tree;
    public FenwickTreeDemo(int size) {
        tree = new int[size + 1];
    }
    public void update(int idx, int delta) {
        for (; idx < tree.length; idx += idx & -idx) {
            tree[idx] += delta;
        }
    }
    public int query(int idx) {
        int sum = 0;
        for (; idx > 0; idx -= idx & -idx) {
            sum += tree[idx];
        }
        return sum;
    }
    public static void main(String[] args) {
        FenwickTreeDemo ft = new FenwickTreeDemo(5);
        ft.update(1, 5);
        ft.update(3, 10);
        System.out.println("Prefix sum of 3: " + ft.query(3)); // 15
        System.out.println("Prefix sum of 2: " + ft.query(2)); // 5
    }
}
