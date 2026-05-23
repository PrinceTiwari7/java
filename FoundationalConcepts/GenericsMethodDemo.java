public class GenericsMethodDemo {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4};
        String[] stringArray = {"A", "B", "C"};
        printArray(intArray);
        printArray(stringArray);
    }
}
