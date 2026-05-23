import java.util.Arrays;
public class GreedyFractionalKnapsack {
    static class Item {
        int weight, value;
        Item(int weight, int value) { this.weight = weight; this.val = value; }
        int val;
    }
    public static double getMaxValue(Item[] items, int capacity) {
        Arrays.sort(items, (a, b) -> Double.compare((double) b.val / b.weight, (double) a.val / a.weight));
        double totalVal = 0.0;
        for (Item item : items) {
            if (capacity - item.weight >= 0) {
                capacity -= item.weight;
                totalVal += item.val;
            } else {
                totalVal += ((double) item.val / item.weight) * capacity;
                break;
            }
        }
        return totalVal;
    }
    public static void main(String[] args) {
        Item[] items = { new Item(10, 60), new Item(20, 100), new Item(30, 120) };
        System.out.println("Max Value: " + getMaxValue(items, 50));
    }
}
