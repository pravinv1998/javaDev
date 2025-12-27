import java.util.*;

public class CollectionBasics {
    public static void main(String[] args) {
        // 1. List Example (Ordered, allows duplicates)
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate allowed
        System.out.println("List of Fruits: " + fruits);

        // Iterating through List
        System.out.println("Iterating List:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 2. Set Example (No duplicates, unordered)
        Set<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println("\nSet of Unique Fruits: " + uniqueFruits);

        // 3. Map Example (Key-Value pairs)
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Pravin");
        studentMap.put(102, "Amit");
        studentMap.put(103, "Sneha");

        System.out.println("\nStudent Map: " + studentMap);

        // Accessing values by key
        System.out.println("Student with ID 102: " + studentMap.get(102));

        // Iterating through Map
        System.out.println("\nIterating Map:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}
