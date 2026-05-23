import java.util.ArrayList;
public class CollectionsArrayListUsage {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.remove("Python");
        System.out.println("ArrayList contains Java: " + list.contains("Java"));
        System.out.println("Elements: " + list);
    }
}
